/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbuisnesstier.entities;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
public class OrderTest {

    static Data data;
    static Order order;

    @BeforeClass
    public static void setUpClass() {
        data = new Data();
    }

    @Before
    public void setUp() {
        order = data.orders[number1];
    }
    @Parameterized.Parameter
    public int number1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{{0}, {1}, {2}};
        return Arrays.asList(data1);
    }

    /**
     * Test of addEquipment method, of class Order.
     */
    @Test
    public void testAddEquipment() {
        System.out.println("addEquipment");
        for (int j = 0; j < data.equipments.length; j++) {
            Equipment equipment = data.equipments[j];
            order.addEquipment(equipment, 2);
            System.out.println(order.getEquipments());
            System.out.println(data.equipments[j]);
            assertEquals(data.equipments[j], order.getEquipments().get(j));
            data.equipments[j].setOrder(null);
        }
    }

    /**
     * Test of changeOrderStatusToEnd method, of class Order.
     */
    @Test
    public void testChangeOrderStatusToEnd() {
        System.out.println("changeOrderStatusToEnd");
        Order instance = data.orders[number1];
        instance.changeOrderStatusToEnd();
        order.changeOrderStatusToEnd();
        assertEquals(data.orders[number1].getStatus(), order.getStatus());
    }

    /**
     * Test of equals method, of class Order.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        for (int j = 0; j < data.orders.length-1; j++) {
            for (int i = j; i < data.orders.length-1; i++) {
                if (i == j) {
                    assertTrue(data.orders[i].equals(data.orders[j]));
                } else {
                    assertFalse(data.orders[i].equals(data.orders[j]));
                }
            }
        }
    }
}
