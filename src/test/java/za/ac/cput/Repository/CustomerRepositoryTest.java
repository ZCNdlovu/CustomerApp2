package za.ac.cput.Repository;

import junit.framework.TestCase;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.Assert.assertNotNull;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerRepositoryTest extends TestCase {

    // Get the singleton instance
    private static CustomerRepository repo = CustomerRepository.getRepository();

    // Create a shared customer object for testing
    private static Customer customer = CustomerFactory.createCustomer1( "Zinhle", "Ndlovu", "zinhle@gmail.com", 26);

    @Test
    public void testAGetRepository() {
        assertNotNull(repo);
        System.out.println("Repository initialized.");
    }

    @Test
    public void testBCreate() {
        Customer created = repo.create(customer);
        assertNotNull(created);
        assertEquals(customer.getId(), created.getId());
        System.out.println("Created: " + created.getFirstName());
    }

    @Test
    public void testCRead() {
        Customer read = repo.read(customer.getId());
        assertNotNull(read);
        System.out.println("Read: " + read.toString());
    }

    @Test
    public void testDUpdate() {
        // Use the Builder's copy method like in your Main class
        Customer updated = new Customer.Builder()
                .copy(customer)
                .setFirstName("Elihle")
                .build();

        assertNotNull(repo.update(updated));
        assertEquals("Elihle", repo.read(customer.getId()).getFirstName());
        System.out.println("Updated Name to: " + repo.read(customer.getId()).getFirstName());
    }

    @Test
    public void testEFindById() {
        Customer found = repo.findById(customer.getId());
        assertNotNull(found);
        System.out.println("Found by ID: " + found.getFirstName());
    }
    @Test
    public void testFGetAll() {
        assertNotNull(repo.getAll());
        System.out.println("All Customers: " + repo.getAll());
    }
    @Test
    public void testGDelete() {
        Customer success = repo.delete(customer.getId());
        assertNull(repo.read(customer.getId()));
        System.out.println("Deleted Successfully: " + success);
    }
}
// All my Testing Passed succefully and had to add alphabets near Testing using caps