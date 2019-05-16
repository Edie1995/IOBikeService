/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbuisnesstier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import subbuisnesstier.entities.Client;
import subbuisnesstier.entities.Equipment;
import subbuisnesstier.entities.Order;
import subbuisnesstier.entities.Service;
import subbuisnesstier.entities.ServiceType;

/**
 *
 * @author Magda
 */
public class FactoryTest {
    
    public FactoryTest() {
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
     * Test of createOrder method, of class Factory.
     */
    @Test
    public void testCreateOrder() {
        System.out.println("createOrder");
        String[] data = null;
        Factory instance = new Factory();
        Order expResult = null;
        Order result = instance.createOrder(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createClient method, of class Factory.
     */
    @Test
    public void testCreateClient() {
        System.out.println("createClient");
        String[] data = null;
        Factory instance = new Factory();
        Client expResult = null;
        Client result = instance.createClient(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewEquipment method, of class Factory.
     */
    @Test
    public void testCreateNewEquipment() {
        System.out.println("createNewEquipment");
        String[] data = null;
        Factory instance = new Factory();
        Equipment expResult = null;
        Equipment result = instance.createNewEquipment(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createServiceType method, of class Factory.
     */
    @Test
    public void testCreateServiceType() {
        System.out.println("createServiceType");
        String[] data = null;
        Factory instance = new Factory();
        ServiceType expResult = null;
        ServiceType result = instance.createServiceType(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createService method, of class Factory.
     */
    @Test
    public void testCreateService() {
        System.out.println("createService");
        String[] data = null;
        ServiceType serviceType = null;
        Factory instance = new Factory();
        Service expResult = null;
        Service result = instance.createService(data, serviceType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
