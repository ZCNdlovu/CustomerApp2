package za.ac.cput.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.domain.Customer;

import static org.junit.Assert.assertNotNull;

public class CustomerFactoryTest  {

    Customer customer = CustomerFactory.createCustomer("211204803","zama@gmail.com"
    );
    Customer cus = CustomerFactory.createCustomer2("2025","Zinhle","Ndlovu","zinhle@gmail.com");
    @Test
   public void createCustomer() {
        //System.out.println(customer);
        assertNotNull(customer);
        System.out.println(customer);
    }
    @Test
    public void createCustomer2() {
        //System.out.println(customer);
        assertNotNull(cus);
        System.out.println(cus);
    }
}