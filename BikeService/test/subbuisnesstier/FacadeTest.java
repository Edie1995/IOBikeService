/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbuisnesstier;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;
import subbuisnesstier.entities.Client;
import subbuisnesstier.entities.Equipment;
import subbuisnesstier.entities.Order;
import subbuisnesstier.entities.Service;
import subbuisnesstier.entities.ServiceType;
import testData.Data;

/**
 *
 * @author kruko
 */
@Category({Test_Reservation.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacadeTest {

    static Data data;
    static Facade instance;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @BeforeClass
    public static void setUpClass() {
        instance = new Facade();
        data = new Data();
    }

    /**
     * Test of searchClient method, of class Facade.
     */
    @Test
    public void testSearchClient_Client() {
        System.out.println("searchClient");
        Client e = null;
        Facade instance = new Facade();
        Client expResult = null;
        Client result = instance.searchClient(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addClient method, of class Facade.
     */
    @Test
    public void test1AddClient() {
        System.out.println("addClient");
        for (int i = 0; i < 5; i++) {
            instance.addClient(data.clientData[i]);
            int number1 = instance.getClients().size();
            instance.addClient(data.clientData[i]);
            int number2 = instance.getClients().size();
            Client result = instance.getClients().get(number2 - 1);
            assertEquals(data.clients[number2 - 1], result);
            assertEquals(number1, number2);
        }
    }

    /**
     * Test of searchClient method, of class Facade.
     */
    @Test
    public void testSearchClient_StringArr() {
        System.out.println("searchClient");
        String[] data = null;
        Facade instance = new Facade();
        Client expResult = null;
        Client result = instance.searchClient(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchOrders method, of class Facade.
     */
    @Test
    public void testSearchOrders() {
        System.out.println("searchOrders");
        Order e = null;
        Facade instance = new Facade();
        Order expResult = null;
        Order result = instance.searchOrders(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEquipment method, of class Facade.
     */
    @Test
    public void test3AddEquipment() {
        System.out.println("addEquipment");
        for (int i = 0; i < 3; i++) {
            instance.addEquipment(data.equipmentData[i]);
            int number1 = instance.getEquipments().size();
            instance.addEquipment(data.equipmentData[i]);
            int number2 = instance.getEquipments().size();
            Equipment result = instance.getEquipments().get(number2 - 1);
            assertEquals(data.equipments[number2 - 1], result);
            assertEquals(number1, number2);
        }
    }

    /**
     * Test of addOrder method, of class Facade.
     */
    @Test
    public void test3AddOrder() {
        System.out.println("addOrder");
        for (int i = 0; i < 3; i++) {
            instance.addOrder(data.orderData[i]);
            int number1 = instance.getOrders().size();
            instance.addOrder(data.orderData[i]);
            int number2 = instance.getOrders().size();
            Order result = instance.getOrders().get(number2 - 1);
            assertEquals(data.orders[number2 - 1], result);
            assertEquals(number1, number2);
        }
    }

    /**
     * Test of searchType method, of class Facade.
     */
    @Test
    public void testSearchType() {
        System.out.println("searchType");
        ServiceType type = null;
        Facade instance = new Facade();
        ServiceType expResult = null;
        ServiceType result = instance.searchType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addServiceType method, of class Facade.
     */
    @Test
    public void test2AddServiceType() {
        System.out.println("addServiceType");
        for (int i = 0; i < 3; i++) {
            instance.addServiceType(data.serviceTypeData[i]);
            int number1 = instance.getServicesTypes().size();
            instance.addServiceType(data.serviceTypeData[i]);
            int number2 = instance.getServicesTypes().size();
            ServiceType result = instance.getServicesTypes().get(number2 - 1);
            assertEquals(data.types[number2 - 1], result);
            assertEquals(number1, number2);
        }
    }

    /**
     * Test of changeOrderStatusToEnd method, of class Facade.
     */
    @Test
    public void testChangeOrderStatusToEnd() {
        System.out.println("changeOrderStatusToEnd");
        String[] dataOrder = null;
        Facade instance = new Facade();
        String expResult = "";
        String result = instance.changeOrderStatusToEnd(dataOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addService method, of class Facade.
     */
    @Test
    public void test3AddService() {
        System.out.println("addService");
        int k = 1, i = 2, j = 1;
        instance.addService(data.clientData[i], data.serviceTypeData[j], data.serviceData[0]);
        instance.addService(data.clientData[i], data.serviceTypeData[j], data.serviceData[1]);
        int number2 = instance.getClients().get(i).getServices().size();
        instance.addService(data.clientData[i], data.serviceTypeData[j], data.serviceData[0]);
        int number3 = instance.getClients().get(i).getServices().size();
        System.out.println(instance.getClients().get(i).getServices().get(number3 - 1));
        System.out.println(data.services[k]);
        Service result = instance.getClients().get(i).getServices().get(number3 - 1);
        data.services[k].setClient(instance.getClients().get(i));
        assertEquals(data.services[k], result);
        assertEquals(number3, number2);
    }

    /**
     * Test of searchEquipment method, of class Facade.
     */
    @Test
    public void testSearchEquipment_StringArr() {
        System.out.println("searchEquipment");
        String[] dataEqupiment = null;
        Facade instance = new Facade();
        Equipment expResult = null;
        Equipment result = instance.searchEquipment(dataEqupiment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEquipment method, of class Facade.
     */
    @Test
    public void testSearchEquipment_Equipment() {
        System.out.println("searchEquipment");
        Equipment equipment = null;
        Facade instance = new Facade();
        Equipment expResult = null;
        Equipment result = instance.searchEquipment(equipment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEquipmentToService method, of class Facade.
     */
    @Test
    public void test4AddEquipmentToService() {
        System.out.println("Add equipment to service");
        int k = 1, i = 2, j = 1;
        instance.addEquipmentToService(data.clientData[i],data.serviceTypeData[i],data.serviceData[j], data.equipmentData[j]);
        instance.addEquipmentToService(data.clientData[i],data.serviceTypeData[i],data.serviceData[j], data.equipmentData[j]);
        int number2 = instance.getClients().get(i).getServices().get(j).getEquipments().size();
       
        instance.addEquipmentToService(data.clientData[i],data.serviceTypeData[i],data.serviceData[j], data.equipmentData[j]);
        int number3 = instance.getClients().get(i).getServices().get(j).getEquipments().size();
        System.out.println(number3);
        Equipment result = instance.getClients().get(i).getServices().get(j).getEquipments().get(number3 - 1);
        assertEquals(data.equipments[k], result);
        assertEquals(number3, number2);
    }

    /**
     * Test of addEquipmentToOrder method, of class Facade.
     */
    @Test
    public void test4AddEquipmentToOrder() {
        System.out.println("addEquipmentToOrder");
        int k = 1, i = 2, j = 1;
        instance.addEquipmentToOrder(data.orderData[i], data.equipmentData[j]);
        instance.addEquipmentToOrder(data.orderData[i], data.equipmentData[j]);
        int number2 = instance.getOrders().get(i).getEquipments().size();
        instance.addEquipmentToOrder(data.orderData[i], data.equipmentData[j]);
        int number3 = instance.getOrders().get(i).getEquipments().size();
        Equipment result = instance.getOrders().get(i).getEquipments().get(number3 - 1);
        assertEquals(data.equipments[k], result);
        assertEquals(number3, number2);
    }

}
