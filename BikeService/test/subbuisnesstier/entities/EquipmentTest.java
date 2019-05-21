/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbuisnesstier.entities;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static subbuisnesstier.entities.ClientTest.data;
import testData.Data;

/**
 *
 * @author kruko
 */
@Category({Test_Entity.class})
@RunWith(Parameterized.class)
public class EquipmentTest {

    static Data data;
    static Equipment equipment;

    @BeforeClass
    public static void setUpClass() {
        data = new Data();
    }

    @Before
    public void setUp() {
        equipment = data.equipments[number1];
    }

    @Parameterized.Parameter
    public int number1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{{0}, {1}, {2}, {3}};
        return Arrays.asList(data1);
    }

    /**
     * Test of increaseAmountEquipment method, of class Equipment.
     */
    @Test
    public void testIncreaseAmountEquipment() {
        System.out.println("increaseAmountEquipment");
        Equipment instance = data.equipments[number1];
        instance.increaseAmountEquipment();
        equipment.increaseAmountEquipment();
        assertEquals(equipment.getAmount(), data.equipments[number1].getAmount());
    }

    /**
     * Test of increaseOrderEquipmentAmount method, of class Equipment.
     */
    @Test
    public void testIncreaseOrderEquipmentAmount() {
        System.out.println("increaseOrderEquipmentAmount");
        int k = 0;
        Equipment instance = data.equipments[number1];
        instance.increaseOrderEquipmentAmount(k);
        equipment.increaseOrderEquipmentAmount(k);
        assertEquals(equipment.getOrderAmount(), data.equipments[number1].getOrderAmount());
    }

    /**
     * Test of decreaseAmountEquipment method, of class Equipment.
     */
    @Test
    public void testDecreaseAmountEquipment() {
        System.out.println("decreaseAmountEquipment");
        Equipment instance = data.equipments[number1];
        instance.decreaseAmountEquipment();
        equipment.decreaseAmountEquipment();
        assertEquals(equipment.getAmount(), data.equipments[number1].getAmount());
    }

    /**
     * Test of checkAvaliable method, of class Equipment.
     */
    @Test
    public void testCheckAvaliable() {
        System.out.println("checkAvaliable");
        Equipment instance = data.equipments[number1];
        boolean result = instance.checkAvaliable();
        boolean expResult = equipment.checkAvaliable();
        assertEquals(result, expResult);
    }

    /**
     * Test of checkOrder method, of class Equipment.
     */
    @Test
    public void testCheckOrder() {
        System.out.println("checkOrder");
        Order order = data.orders[0];
        Equipment instance = data.equipments[number1];
        instance.setOrder(order);
        equipment.setOrder(order);
        assertEquals(equipment.getOrder(), instance.getOrder());
    }

    /**
     * Test of equals method, of class Equipment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        for (int j = 0; j < data.equipments.length-1; j++) {
            for (int i = j; i < data.equipments.length-1; i++) {
                if (i == j) {
                    assertTrue(data.equipments[i].equals(data.equipments[j]));
                } else {
                    assertFalse(data.equipments[i].equals(data.equipments[j]));
                }
            }
        }

    }

}
