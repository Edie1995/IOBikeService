/*
Testowanie metod z kategorii Test_Control z wyłaczeniem kategorii Test_Order
 */
package testsuite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import subbuisnesstier.FacadeTest;
import subbuisnesstier.FactoryTest;
import subbuisnesstier.Test_Control;
import subbuisnesstier.entities.ClientTest;
import subbuisnesstier.entities.EquipmentTest;
import subbuisnesstier.entities.OrderTest;
import subbuisnesstier.entities.ServiceTest;
import subbuisnesstier.entities.ServiceTypeTest;
import subbuisnesstier.Test_Order;

/**
 *
 * @author Magda
 */
@Categories.SuiteClasses({FactoryTest.class, ServiceTest.class, ClientTest.class, EquipmentTest.class, OrderTest.class, ServiceTypeTest.class, FacadeTest.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(Test_Control.class)
@Categories.ExcludeCategory(Test_Order.class)
public class Suite13 {

}
