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
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import subbuisnesstier.entities.Client;
import subbuisnesstier.entities.Equipment;
import subbuisnesstier.entities.Order;
import subbuisnesstier.entities.Service;
import subbuisnesstier.entities.ServiceType;
import testData.Data;

/**
 *
 * @author Magda
 */
@Category({Test_Control.class})
public class FactoryTest {

    public FactoryTest() {
    }

    static Data data;
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @BeforeClass
    public static void setUpClass() {
        data = new Data();
    }

    /**
     * Test of createOrder method, of class Factory.
     */
    @Test
    @Category(Test_Order.class)
    public void testCreateOrder() {
        System.out.println("createOrder");
        Factory instance = new Factory();
        for (int i = 0; i < 3; i++) {
            Order result = instance.createOrder(data.orderData[i]);
            assertEquals(data.orders[i], result);
        }
    }

    /**
     * Test of createClient method, of class Factory.
     */
    @Test
    public void testCreateClient() {
        System.out.println("createClient");
        Factory instance = new Factory();
        for (int i = 0; i < 4; i++) {
            Client result = instance.createClient(data.clientData[i]);
            assertEquals(data.clients[i], result);
        }
    }

    /**
     * Test of createNewEquipment method, of class Factory.
     */
    @Test
    public void testCreateNewEquipment() {
        System.out.println("createNewEquipment");
        Factory instance = new Factory();
        for (int i = 0; i < 3; i++) {
            Equipment result = instance.createNewEquipment(data.equipmentData[i]);
            assertEquals(data.equipments[i], result);
        }
    }

    /**
     * Test of createServiceType method, of class Factory.
     */
    @Test
    public void testCreateServiceType() {
        System.out.println("createServiceType");
        Factory instance = new Factory();
        for (int i = 0; i < 3; i++) {
            ServiceType result = instance.createServiceType(data.serviceTypeData[i]);
            assertEquals(data.types[i], result);
        }
    }

    /**
     * Test of createService method, of class Factory.
     */
    @Test
    public void testCreateService() {
        System.out.println("createService");
        ServiceType serviceType;
        Factory instance = new Factory();
        for (int i = 0; i < 3; i++) {
            serviceType = instance.createServiceType(data.serviceTypeData[i]);
            Service result = instance.createService(data.serviceData[i], serviceType);
            assertEquals(data.services[i], result);
        }
    }

}
