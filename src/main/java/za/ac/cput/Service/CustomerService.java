package za.ac.cput.Service;

import za.ac.cput.Repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository repository;
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

}
