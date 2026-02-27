package za.ac.cput.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.domain.Customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerFactoryTest  {

    Customer customer = CustomerFactory.createCustomer("211204803","zama@gmail.com"
    );
    Customer cus = CustomerFactory.createCustomer2("2025","Zinhle","Ndlovu","zinhle@gmail");
    Customer cus2 = CustomerFactory.createCustomer2("2027","Asanda","Ndlovu","Asanda@gmail.com");
    @Test
   public void createCustomer() {
        //System.out.println(customer);
        assertNotNull(customer);
        assertEquals("");
        System.out.println(customer);
    }
    @Test
    public void wrongEmailAddress() {
        //System.out.println(customer);
        assertNotNull(cus);
        System.out.println(cus);
    }
    @Test
    public void rightEmailAddress() {
        //System.out.println(customer);
        assertNotNull(cus2);
        System.out.println(cus2);
    }
    @Test
    public void wrongP() {}
}