package za.ac.cput.Repository;

import za.ac.cput.domain.Customer;

import java.util.List;

public interface IRepository {
    Customer create(Customer customer);

    //Customer read (int id );
    Customer read (String Id );

    Customer update (Customer customer);

    List<Customer> getAll();

    // Customer findById(int id);
    Customer findById(String Id);

    //void delete(int id);
    boolean delete(String Id);
}
