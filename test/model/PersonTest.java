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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getPersonId method, of class Person.
     */
    
    @Test
    public void testGetPersonId() {
        System.out.println("getPersonId");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.getPersonId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPersonId method, of class Person.
     */
    @Test
    public void testSetPersonId() {
        System.out.println("setPersonId");
        int personId = 0;
        Person instance = new Person();
        instance.setPersonId(personId);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFirstName method, of class Person.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Person instance = new Person();
        instance.setFirstName("Jack");
        String expResult = "Jack";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "bob";
        Person instance = new Person();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSecondName method, of class Person.
     */
    @Test
    public void testGetSecondName() {
        System.out.println("getSecondName");
        Person instance = new Person();
        instance.setSecondName("Winter");
        String expResult = "Winter";
        String result = instance.getSecondName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSecondName method, of class Person.
     */
    @Test
    public void testSetSecondName() {
        System.out.println("setSecondName");
        String secondName = "";
        Person instance = new Person();
        instance.setSecondName(secondName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getStreet method, of class Person.
     */
    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        Person instance = new Person();
        instance.setStreet("syston farm");
        String expResult = "syston farm";
        String result = instance.getStreet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setStreet method, of class Person.
     */
    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        String street = "";
        Person instance = new Person();
        instance.setStreet(street);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCity method, of class Person.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Person instance = new Person();
        instance.setCity("Stavanger");
        String expResult = "Stavanger";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCity method, of class Person.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "bristol";
        Person instance = new Person();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
