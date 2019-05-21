/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbuisnesstier.entities;

import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import testData.Data;

/**
 *
 * @author kruko
 */
@Category({Test_Entity.class})
@RunWith(Parameterized.class)
public class ClientTest {

    static Data data;
    static Client client;

    @BeforeClass
    public static void setUpClass() {
        data = new Data();
    }

    @Before
    public void setUp() {
        client = data.clients[number1];
    }

    @Parameterized.Parameter
    public int number1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{{0}, {1}, {2}, {3}, {4}};
        return Arrays.asList(data1);
    }

    /**
     * Test of addEquipmentToService method, of class Client.
     */
    @Test
    public void testAddEquipmentToService() {
        System.out.println("addEquipmentToService");
        //Client client = data.clients[0];
        ServiceType type = data.types[0];
        int i = 0;
        for (Equipment e : data.equipments) {
            client.addEquipmentToService(data.serviceData[0], type, e);
            assertSame(e, type.getServices().get(0).getEquipments().get(i));
            assertSame(e, client.getServices().get(0).getEquipments().get(i));
            assertSame(client.getServices().get(0).getEquipments().get(i), type.getServices().get(0).getEquipments().get(i));
            i++;
        }
    }

    /**
     * Test of addService method, of class Client.
     */
    @Test
    public void testAddService() {
        System.out.println("addService");
        ServiceType type ;
        for (int j = 0; j < data.serviceData.length; j++) {
            type = data.types[j];
            client.addService(data.serviceData[j], type);
            assertSame(client.getServices().get(j), type.getServices().get(number1));
        }
        for (int i = 0; i < data.serviceData.length; i++) {
            type = data.types[i];
            data.clients[0].addService(data.serviceData[i], type);
            assertEquals(client.getServices().size(), data.services.length);
        }
    }

    /**
     * Test of searchService method, of class Client.
     */
    @Test
    public void testSearchService_Service() {
        System.out.println("searchService");
        for (int i = 0; i < data.services.length; i++) {
            data.services[i].setClient(client);
            Service result = client.searchService(data.services[i]);
            assertEquals(result, data.services[i]);
        }
    }

    /**
     * Test of equals method, of class Client.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        for (int j = 0; j < data.clients.length-1; j++) {
            for (int i = j; i < data.clients.length-1; i++) {
                if (i == j) {
                    assertTrue(data.clients[i].equals(data.clients[j]));
                } else {
                    assertFalse(data.clients[i].equals(data.clients[j]));
                }
            }
        }

    }
}
