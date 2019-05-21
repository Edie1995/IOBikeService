/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subbuisnesstier.entities;

import java.util.ArrayList;
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
import static subbuisnesstier.entities.ServiceTest.data;
import testData.Data;

/**
 *
 * @author kruko
 */
@Category({Test_Entity.class})
@RunWith(Parameterized.class)
public class ServiceTypeTest {

    static Data data;
    static ServiceType type;

    @BeforeClass
    public static void setUpClass() {
        data = new Data();
    }

    @Before
    public void setUp() {
        type = data.types[number1];
    }

    @Parameterized.Parameter
    public int number1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{{0}, {1}, {2}, {3}};
        return Arrays.asList(data1);
    }

    /**
     * Test of addServices method, of class ServiceType.
     */
    @Test
    public void testAddServices() {
        System.out.println("addServices");
        for (int i = 0; i < data.services.length; i++) {
            type.addServices(data.services[i]);
            assertSame(type.getServices().get(i), data.services[i]);
        }
    }

    /**
     * Test of equals method, of class ServiceType.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        for (int j = 0; j < data.types.length; j++) {
            for (int i = j; i < data.types.length; i++) {
                if (i == j) {
                    assertTrue(data.types[i].equals(data.types[j]));
                } else {
                    assertFalse(data.types[i].equals(data.types[j]));
                }
            }
        }
    }
}
