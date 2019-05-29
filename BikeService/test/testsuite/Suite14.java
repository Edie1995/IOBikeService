/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magda
 */
/*

 */
package testsuite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import subbuisnesstier.FacadeTest;
import subbuisnesstier.FactoryTest;
import subbuisnesstier.entities.ClientTest;
import subbuisnesstier.entities.EquipmentTest;
import subbuisnesstier.entities.OrderTest;
import subbuisnesstier.entities.ServiceTest;
import subbuisnesstier.entities.ServiceTypeTest;

@Categories.SuiteClasses({FactoryTest.class, ServiceTest.class, ClientTest.class, EquipmentTest.class, OrderTest.class, ServiceTypeTest.class, FacadeTest.class})
@RunWith(Categories.class)
public class Suite14 {
    
}
