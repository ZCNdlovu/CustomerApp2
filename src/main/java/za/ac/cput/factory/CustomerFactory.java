package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {
    public static Customer createCustomer(String customerId,  String emailAddress ){
        if (Helper.isNullorEmpty(customerId)  ||!Helper.isValidEmailWithRegex(emailAddress)) {
            System.out.println("Invalid Customer Data: Check ID or Email format.");
            return null;
        }
        return new Customer.Builder().createCus(customerId,emailAddress)
                .build();
    }

    public static Customer createCustomer2(String customerId, String firstName, String lastName, String emailAddress){
        if (Helper.isNullorEmpty(customerId) || Helper.isNullorEmpty(firstName)|| Helper.isNullorEmpty(lastName) ||!Helper.isValidEmailWithRegex(emailAddress)) {
            System.out.println("Invalid Customer Data: Check ID or Email format.");
            return null;
        }
        return new Customer.Builder()
                .setCustomerId(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmailAddress(emailAddress)
                .build();

    }
}
