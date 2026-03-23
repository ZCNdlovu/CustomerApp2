package za.ac.cput.Repository;

import za.ac.cput.domain.Customer;

import java.util.List;

public class CustomerListRepository implements IRepository<Customer>{
    List<Customer> customers;


    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer read(String Id) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public Customer findById(String Id) {
        return null;
    }

    @Override
    public boolean delete(String Id) {
        return false;
    }
}
