package za.ac.cput.Repository;

import za.ac.cput.domain.Customer;

public interface ICustomerRepository extends IRepository<Customer, Integer>{


    Customer findById(int Id);

}
