package za.ac.cput.Repository;

import za.ac.cput.domain.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository  implements  ICustomerRepository{

    private static CustomerRepository repo = null;
    private Map<Integer, Customer> customerMap;

    private CustomerRepository() {
    customerMap = new HashMap<Integer, Customer>();
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
        customerMap.put(customer.getId(), customer);
        return customer;
    }

    @Override
    public Customer read(Integer Id) {
        if (Id == null) {
            return null;
        }
        return customerMap.get(Id);

    }
    @Override
    public Customer update(Customer customer) {
        if (customer == null) {
            return null;
        }
        int customerId = customer.getId();
        if (customerId <= 0) {
            return null;
        }
        if(customerMap.containsKey(customerId)) {
            customerMap.put(customerId, customer);
            return customer;
        }
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer delete(Integer id) {
        customerMap.remove(id);
        return null;
    }
    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }


}
// Method when i am using Strings ID
// private Map<String, Customer> customerMap1;
//    private CustomerRepository1() {
//        customerMa1 = new HashMap<String, Customer>();
//    }
//    @Override
//    public Customer create(Customer customer) {
//        customerMap1.put(customer.getId(), customer);
//        return customer;
//    }
//    @Override
//    public Customer read(int id) {
//        return null;
//    }
//
//    @Override
//    public Customer update(Customer customer) {
//        if(customerMap1.containsKey(customer.getID())) {
//            customerMap1.put(customer.getID(), customer);
//            return customer;
//        }
//        return null;
//    }
//    @Override
//    public Customer delete(String Id) {
//        return null;
//    }
//    @Override
//    public Customer findById(String Id) {
//        return customerMap1.get(Id);
//    }
//    @Override
//    public Customer delete(String Id) {
//
//        customerMap1.remove(Id);
//    }
