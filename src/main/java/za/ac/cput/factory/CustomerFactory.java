package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;
import za.ac.cput.util.UtilValidator;

public class CustomerFactory {
    public static Customer createCustomer(String firstName,  String emailAddress ){
        Helper.requireNotEmptyOrNull(firstName,"firstName");
        if (!Helper.isValidEmail(emailAddress)) {
            System.out.println("Invalid Customer Data: Check Name or Email format.");

        }
        return new Customer.Builder().createCus(firstName,emailAddress)
                .build();
    }
    public static Customer createCustomer1( String Id,String firstName, String lastName, String emailAddress, int age){
        Helper.requireNotEmptyOrNull(Id, "ID");
        Helper.requireNotEmptyOrNull(firstName, "firstName");
        Helper.requireNotEmptyOrNull(lastName, "lastName");
        if ( !Helper.isValidEmail(emailAddress)
        ) {
            System.out.println("Invalid Customer Data: Check ID or Email format.");


        }
        Helper.requireNotNegative(age, "Age");
        return new Customer.Builder()
                .setID(Id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmailAddress(emailAddress)
                .setAge(age)
                .build();

    }
    public static Customer createCustomer2( String firstName, String lastName, String emailAddress, int age){
        Helper.requireNotEmptyOrNull(firstName, "firstName");
        Helper.requireNotEmptyOrNull(lastName, "lastName");
        if ( !Helper.isValidEmail(emailAddress)
        ) {
            System.out.println("Invalid Customer Data: Check ID or Email format.");


        }
        Helper.requireNotNegative(age, "Age");
        return new Customer.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmailAddress(emailAddress)
                .setAge(age)
                .build();

    }
}
