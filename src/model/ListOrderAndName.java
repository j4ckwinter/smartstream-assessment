/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jackwinter
 */
public class ListOrderAndName {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        DatabaseHandler db = new DatabaseHandler();

        List<Order> orderList = db.getAllOrders();
        List<Person> personList = db.getAllPeople();

        Iterator<Order> it1 = orderList.iterator();

        while (it1.hasNext()) {
            Order order = it1.next();
            int id = order.getPersonId();
            int orderNo = order.getOrderNumber();

            Iterator<Person> it2 = personList.iterator();

            while (it2.hasNext()) {
                Person person = it2.next();
                int id2 = person.getPersonId();
                if (id == id2) {
                    String name = person.getFirstName();
                    System.out.println("First name: " + name);
                    System.out.println("Order number: " + orderNo);
                }

            }
        }

    }

}
