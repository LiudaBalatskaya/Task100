import base.TestBaseFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

@Title("Second test suite")
@Description("There are using Page Factory pattern")
public class MailRuFactoryTest extends TestBaseFactory {

    @Title("Verify loaded page")
    @Description("Verify true title loaded page ")
    @Test
    @TestCaseId("2.1.2")
    public void gotoMailRu() {
        login.login();
        getWaiter().until(ExpectedConditions.visibilityOf(login.menu));
        Assert.assertTrue(home.portalMenu().contentEquals("portal-menu"));
    }

}