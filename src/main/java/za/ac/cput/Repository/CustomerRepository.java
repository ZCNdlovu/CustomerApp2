package za.ac.cput.Repository;

import za.ac.cput.domain.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository  implements  IRepository{

    private static CustomerRepository repo = null;
    //private Map<Integer, Customer> customerMap1;
    private Map<String, Customer> customerMap;
    //private CustomerRepository1() {
//    customerMap1 = new HashMap<Integer, Customer>();
//}
    private CustomerRepository() {
        customerMap = new HashMap<String, Customer>();
    }

    //This is a Singlton  Method
    public static CustomerRepository getRepository() {
        if(repo == null) {
            repo = new CustomerRepository();
        }
        return repo;
    }
    @Override
    public Customer create(Customer customer) {
        customerMap.put(customer.getID(), customer);
        return customer;
    }
    //    @Override
//    public Customer create(Customer customer) {
//        customerMap1.put(customer.getId(), customer);
//        return customer;
//    }
    @Override
    public Customer read(String Id) {
        return customerMap.get(Id);
    }
//    @Override
//    public Customer read(int id) {
//        return null;
//    }

    @Override
    public Customer update(Customer customer) {
        if(customerMap.containsKey(customer.getID())) {
            customerMap.put(customer.getID(), customer);
            return customer;
        }
        return null;
    }
//    @Override
//    public Customer update(Customer customer) {
//        if(customerMap1.containsKey(customer.getId())) {
//            customerMap1.put(customer.getId(), customer);
//            return customer;
//        }
//        return null;
//    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer findById(String Id) {
        return customerMap.get(Id);
    }
//    @Override
//    public Customer findById(int id) {
//        return customerMap1.get(id);
//    }

    @Override
    public boolean delete(String Id) {
        if (customerMap.containsKey(Id)) {
            customerMap.remove(Id);
            return true;
        }
        return false;
    }
//    @Override
//    public void delete(int id) {
//        customerMap1.remove(id);
//    }
}
