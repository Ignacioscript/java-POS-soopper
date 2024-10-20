package org.ignacioScript.co;

import org.ignacioScript.co.dao.CustomerDAO;
import org.ignacioScript.co.model.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        Customer customer = new Customer(5,"Alan Harper", "harper@gmail.com", "11223344", "USA, Malibu 234");

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.create(customer);

    }
}