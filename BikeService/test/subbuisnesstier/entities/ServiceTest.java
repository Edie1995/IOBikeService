/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbuisnesstier.entities;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static subbuisnesstier.entities.OrderTest.data;
import testData.Data;

/**
 *
 * @author kruko
 */
@Category({Test_Entity.class})
@RunWith(Parameterized.class)
public class ServiceTest {

    static Data data;
    static Service service;

    @BeforeClass
    public static void setUpClass() {
        data = new Data();
    }

    @Before
    public void setUp() {
        service = data.services[number1];
    }

    @Parameterized.Parameter
    public int number1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{{0}, {1}, {2}, {3}};
        return Arrays.asList(data1);
    }

    /**
     * Test of changeStatus method, of class Service.
     */
    @Test
    public void testChangeStatus() {
        System.out.println("changeStatus");
        for (int i = 0; i < data.status.length; i++) {
            Status status = data.status[i];
            service.changeStatus(status);
            assertSame(service.getStatus(), data.status[i]);
        }
    }

    /**
     * Test of addEquipment method, of class Service.
     */
    @Test
    public void testAddEquipment() {
        System.out.println("addEquipment");
        for (int j = 0; j < data.equipmentData.length; j++) {
            service.addEquipment(data.equipments[j]);
            assertSame(service.getEquipments().get(j), data.equipments[j]);
        }
    }

    /**
     * Test of equals method, of class Service.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        for (int j = 0; j < data.services.length; j++) {
            for (int i = j; i < data.services.length; i++) {
                if (i == j) {
                    assertTrue(data.services[i].equals(data.services[j]));
                } else {
                    assertFalse(data.services[i].equals(data.services[j]));
                }
            }
        }
    }
}
