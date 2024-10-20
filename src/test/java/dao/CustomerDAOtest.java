package dao;

import org.ignacioScript.co.dao.CustomerDAO;
import org.ignacioScript.co.model.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import resolvers.CustomerParameterResolver;
import resolvers.DaoParameterResolver;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({CustomerParameterResolver.class, DaoParameterResolver.class})
public class CustomerDAOtest {


    @Test
    public void testCreateCustomer(CustomerDAO customerDAO, Customer customer){
        customerDAO.create(customer);

        Customer retrieved = customerDAO.getOne(customer.getId());
//        assertNotNull(retrieved);
        assertEquals("Charlie Harper", retrieved.getName());

    }

    @Test
    public void testDeleteCustomer(CustomerDAO customerDAO, Customer customer) {
        // Create a customer
        customerDAO.create(customer);
        assertNotNull(customerDAO.getOne(customer.getId()));

        // Delete the customer and verify no exception is thrown
        assertDoesNotThrow(() -> customerDAO.delete(customer.getId()));

        // Verify the customer no longer exists
        assertNull(customerDAO.getOne(customer.getId()));
    }






}
