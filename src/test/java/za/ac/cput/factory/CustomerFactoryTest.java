package za.ac.cput.factory;

import junit.framework.TestCase;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import za.ac.cput.domain.Customer;

import static org.junit.Assert.*;

public class CustomerFactoryTest  {

    //Customer 1
    Customer customer = CustomerFactory.createCustomer("Zama","zama@gmail.com"
    );
    //Customer 2
    Customer cus = CustomerFactory.createCustomer2("Zinhle","Ndlovu","zinhle@gmail.com", 26);

    //Customer 3
    Customer customer3 = new Customer.Builder()
            .setFirstName("Elihle")
            .setLastName("Zungu")
            .setEmailAddress("elihle@gmail.com")
            .setAge(12)
            .build();
    @Test
   public void createCustomer() {
        //System.out.println(customer);
        assertNotNull(cus);
        assertNotNull(customer);
        assertEquals("Zama",customer.getFirstName());
        assertEquals("zama@gmail.com", customer.getEmailAddress());
        System.out.println(customer);
        System.out.println(cus);
    }
    @Test
    public void createCustomer2() {
        //System.out.println(customer);
        assertNotNull(cus);
        assertEquals("Zinhle", cus.getFirstName());
        assertEquals("Ndlovu",cus.getLastName());
        assertEquals("zinhle@gmail.com", cus.getEmailAddress());
        assertEquals(26, cus.getAge());
        System.out.println(cus);
    }
    @Test
    public void shouldCreateCustomerUsingBuilder(){
        assertEquals("Elihle", customer3.getFirstName());
        assertEquals("Zungu",customer3.getLastName());
        assertEquals("elihle@gmail.com", customer3.getEmailAddress());
        assertEquals(12, customer3.getAge());
        System.out.println(customer);
        System.out.println(cus);
        System.out.println(customer3);

    }
    @Test
    @DisplayName("Should throw exception if name is blank")
    public void showExceptionIfNameIsBlank(){
        assertThrows(IllegalArgumentException.class, ()-> {
            // FIX: You must actually pass a blank name ("") to trigger the error!
            CustomerFactory.createCustomer2("", "Thango", "tcthango@gmail.com", 50);
        });
    }
    @Test
    @DisplayName("Should throw exception if Email is blank")
    public void showExceptionIfEmailIsNull(){
        assertThrows(IllegalArgumentException.class, () ->
            CustomerFactory.createCustomer2("Thanda","Thango", "",50)
        );
    }
    @Test
    @DisplayName("Should throw exception if Email is blank")
    public void showExceptionIfEmailIsInvalid(){
        assertThrows(IllegalArgumentException.class, () ->
                CustomerFactory.createCustomer2("Thanda","Thango", "tcthango@g",50)
        );
    }
    @Test
    @DisplayName("Should throw exception if Email is blank")
    public void showExceptionIfAgeIsNagative(){
        assertThrows(IllegalArgumentException.class, () ->
                CustomerFactory.createCustomer2("Thanda","Thango", "tcthango@gmail.com",-50)
        );
    }
    // All my Tes Passed and i have checked even the ones with correct values to verify if testing is working accodingly
}