package za.ac.cput;

import za.ac.cput.Repository.CustomerRepository;
import za.ac.cput.Repository.IRepository;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        IRepository repo = CustomerRepository.getRepository();
//        Customer cust = CustomerFactory.createCustomer2("Zinhle","Ndlovu","zinhle@gmail.com", 26);
//        Customer cust2 = CustomerFactory.createCustomer2("Zama","Ndlovu","zama@gmail.com", 35);

        Customer cus = CustomerFactory.createCustomer1("01","Zinhle","Ndlovu","zinhle@gmail.com", 26);
        Customer cus2 = CustomerFactory.createCustomer1("02","Zama","Ndlovu","zama@gmail.com", 35);
        System.out.println("Saving");
        repo.create(cus);
        repo.create(cus2);
        Customer found = repo.findById("01");
        Customer found2 = repo.findById("02");
//        Customer get = repo.findById(cust.getId());
//        Customer get2 = repo.findById(cust2.getId());
        System.out.println("Name Found is : " +found.getEmailAddress());
        System.out.println("Name Found is : " +found2.getFirstName());

        repo.getAll().forEach(c -> System.out.println(c.getID()+ " " + c.getFirstName()) );

        Customer updatedCustomer = new Customer.Builder()
                .copy(found)
                .setFirstName("Elihle")
                .build();
        System.out.println("Updating");
        repo.update(updatedCustomer);
        repo.getAll().forEach(c -> System.out.println(c.getID()+ " " + c.getFirstName()) );

        System.out.println("Deleting");
        repo.delete("02");
        repo.getAll().forEach(c -> System.out.println(c.getID()+ " " + c.getFirstName()) );

    }
}