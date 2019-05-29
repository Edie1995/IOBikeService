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
import subbuisnesstier.entities.Status;
import testData.Data;

/**
 *
 * @author kruko
 */
@Category({Test_Control.class})
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
    @Category(Test_Order.class)
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
    @Category(Test_Order.class)
    public void testChangeOrderStatusToEnd() {
        System.out.println("changeOrderStatusToEnd");
        assertNotEquals(Status.ZAKONCZONE, instance.getOrders().get(0).getStatus());
        instance.changeOrderStatusToEnd(data.orderData[0]);
        assertEquals(Status.ZAKONCZONE, instance.getOrders().get(0).getStatus());

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
        Service result = instance.getClients().get(i).getServices().get(number3 - 1);
        data.services[k].setClient(instance.getClients().get(i));
        assertEquals(data.services[k], result);
        assertEquals(number3, number2);
    }

    @Test

    public void test4AddEquipmentToService() {
        System.out.println("addEquipmentToService");
        int k = 1, i = 2, j = 1;

        instance.addEquipmentToService(data.clientData[i], data.serviceTypeData[j], data.serviceData[0], data.equipmentData[0]);
        instance.addEquipmentToService(data.clientData[i], data.serviceTypeData[j], data.serviceData[0], data.equipmentData[1]);
        int number2 = instance.getClients().get(i).getServices().get(0).getEquipments().size();
        instance.addEquipmentToService(data.clientData[i], data.serviceTypeData[i], data.serviceData[j], data.equipmentData[j]);
        int number3 = instance.getClients().get(i).getServices().get(0).getEquipments().size();
        Equipment result = instance.getClients().get(i).getServices().get(0).getEquipments().get(number3 - 1);
        assertEquals(data.equipments[k], result);
        assertEquals(number3, number2);
    }

    /**
     * Test of addEquipmentToOrder method, of class Facade.
     */
    @Test
    @Category(Test_Order.class)
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
