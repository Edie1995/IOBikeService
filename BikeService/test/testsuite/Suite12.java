/*
 Testowanie klas nalezacych tylko do kategorii Test_Entity
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

/**
 *
 * @author Magda
 */
@Categories.SuiteClasses({FactoryTest.class, ClientTest.class, EquipmentTest.class, OrderTest.class, ServiceTest.class, ServiceTypeTest.class, FacadeTest.class})
@RunWith(Categories.class)
@Categories.ExcludeCategory(Test_Control.class)
public class Suite12 {

}
