/*
Testowanie Fabryki i Fasady
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

@Categories.SuiteClasses({FacadeTest.class,FactoryTest.class, EquipmentTest.class, OrderTest.class, ClientTest.class, ServiceTest.class, ServiceTypeTest.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(Test_Control.class)
/**
 *
 * @author Magda
 */
public class Suite11 {

}
