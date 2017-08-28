import Utilities.Driver;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class FalseMailRuTest extends TestBase {
    @Test
    @TestCaseId("1.1.4")
    @Description("Verify false title of the e-mail page ")
    public void falseNameVerify() {
        login.waitLoginPageAppear();
        Assert.assertEquals(login.dataTitle(), "Is not ПочтаMail.Ru \n" + Driver.description());
    }

}
