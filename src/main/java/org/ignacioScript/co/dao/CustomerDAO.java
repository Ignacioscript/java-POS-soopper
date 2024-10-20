package org.ignacioScript.co.dao;

import org.ignacioScript.co.model.Customer;
import org.ignacioScript.co.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class CustomerDAO extends DataAccessObject<Customer> {

    public CustomerDAO() throws SQLException  {

    }



    private final String CREATE     = "INSERT INTO Customers  VALUES(?, ?, ?, ?, ?)";
    private final String READ_ALL   = "SELECT * FROM Customers";
    private final String READ_ONE   = "SELECT * FROM  Customers WHERE  customerId = ?";
    private final String UPDATE     = "UPDATE Customers SET customerName=?, customerEmail=?, customerPhone=?, customerAddress=? WHERE customerId=?";
    private final String DELETE     = "DELETE FROM Customers WHERE customerId=?";



    @Override
    public void create(Customer customer) {
        try(Connection connection =  DButil.getConnection();
            PreparedStatement statement = connection.prepareStatement(CREATE)){
            statement.setInt(1, customer.getId());
            statement.setString(2,customer.getName());
            statement.setString(3, customer.getEmail() );
            statement.setString(4, customer.getPhone());
            statement.setString(5, customer.getContactAddress());
            statement.execute();
        }catch (SQLException e){
            throw  new RuntimeException();
        }
        

    }


    @Override
    public void update(Customer customer) {
        try(Connection connection =  DButil.getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE)){
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getEmail());
            statement.setString(3, customer.getPhone());
            statement.setString(4, customer.getContactAddress());
            statement.setInt(5, customer.getId());
            statement.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException("Update failed");
        }

    }

    @Override
    public void delete(int id) {
        try(Connection connection =  DButil.getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE)){
            statement.setInt(1, id);
            statement.execute();
            System.out.println("Delete success");
        }catch (SQLException e){

            throw  new RuntimeException("Delete failed");
        }

    }

    @Override
    public Customer getOne(int id) {
        Customer customer;
        try(Connection connection =  DButil.getConnection();
            PreparedStatement statement = connection.prepareStatement(READ_ONE)){
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            rs.absolute(1);
            String customerName = rs.getString(2);
            String customerEmail = rs.getString(3);
            String customerPhone = rs.getString(4);
            String customerAddress = rs.getString(5);
            customer = new Customer(customerName, customerEmail, customerPhone, customerAddress);
            System.out.println("Customer found");

        }catch (SQLException e){
            System.out.println("Customer not found");
        throw new RuntimeException("Failed");}


        return customer;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        Customer customer;

        try(Connection connection =  DButil.getConnection();
            PreparedStatement statement = connection.prepareStatement(READ_ALL)){
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                customer = new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
                customerList.add(customer);
                System.out.println("Retrieve Customers Data successfully");
            }
        }catch (SQLException e){
            throw new RuntimeException("Failed to retrieve All Customers");
        }
        return customerList;
    }
}
