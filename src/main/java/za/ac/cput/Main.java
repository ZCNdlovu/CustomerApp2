package za.ac.cput;

import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

public class Main {
    public static void main(String[] args) {
Customer cus = CustomerFactory.createCustomer("211204803","211204803@gmail.com");
System.out.println(cus);
    }
}