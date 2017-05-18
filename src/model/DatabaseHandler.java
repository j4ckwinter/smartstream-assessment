/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jackwinter
 */
public class DatabaseHandler {

    public List<Person> getAllPeople() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://localhost/smart", "root", "");

        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM Person");

        List<Person> names = new ArrayList<Person>();

        while (resultSet.next()) {
            Person person = new Person();
            person.setPersonId(resultSet.getInt("person_id"));
            person.setFirstName(resultSet.getString("first_name"));
            person.setSecondName(resultSet.getString("last_name"));
            person.setStreet(resultSet.getString("street"));
            person.setCity(resultSet.getString("city"));
            names.add(person);
        }
        return names;
    }

    public List<Order> getAllOrders() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://localhost/smart", "root", "");

        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM Orders");

        List<Order> orders = new ArrayList<Order>();

        while (resultSet.next()) {
            Order order = new Order();
            order.setOrderId(resultSet.getInt("order_id"));
            order.setOrderNumber(resultSet.getInt("order_no"));
            order.setPersonId(resultSet.getInt("person_id"));
            orders.add(order);
        }
        return orders;
    }


}
