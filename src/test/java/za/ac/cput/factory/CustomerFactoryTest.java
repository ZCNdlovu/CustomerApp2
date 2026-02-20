package za.ac.cput.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.domain.Customer;

import static org.junit.Assert.assertNotNull;

public class CustomerFactoryTest  {

    Customer customer = CustomerFactory.createCustomer("211204803","zama@gmail.com"
    );
    @Test
   public void createCustomer() {
        //System.out.println(customer);
        assertNotNull(customer);
        System.out.println(customer);
    }
}