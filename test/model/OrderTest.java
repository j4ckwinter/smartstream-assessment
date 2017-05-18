/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jackwinter
 */
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getOrderId method, of class Order.
     */
    @Test
    public void testGetOrderId() {
        System.out.println("getOrderId");
        Order instance = new Order();
        instance.setOrderId(12345);
        int expResult = 12345;
        int result = instance.getOrderId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOrderId method, of class Order.
     */
    @Test
    public void testSetOrderId() {
        System.out.println("setOrderId");
        int orderId = 0;
        Order instance = new Order();
        instance.setOrderId(orderId);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOrderNumber method, of class Order.
     */
    @Test
    public void testGetOrderNumber() {
        System.out.println("getOrderNumber");
        Order instance = new Order();
        instance.setOrderNumber(43);
        int expResult = 43;
        int result = instance.getOrderNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOrderNumber method, of class Order.
     */
    @Test
    public void testSetOrderNumber() {
        System.out.println("setOrderNumber");
        int orderNumber = 0;
        Order instance = new Order();
        instance.setOrderNumber(orderNumber);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPersonId method, of class Order.
     */
    @Test
    public void testGetPersonId() {
        System.out.println("getPersonId");
        Order instance = new Order();
        instance.setPersonId(7777);
        int expResult = 7777;
        int result = instance.getPersonId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPersonId method, of class Order.
     */
    @Test
    public void testSetPersonId() {
        System.out.println("setPersonId");
        int personId = 0;
        Order instance = new Order();
        instance.setPersonId(personId);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
