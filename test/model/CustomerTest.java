package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void shouldCreateMovie(){

        Customer customer = new Customer(false,"Flavia", "banana", "flavia@email.com", "555-1234");

        assertEquals(customer.getName(), "Flavia");
    }

}