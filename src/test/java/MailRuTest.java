import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

@Title("Mail ru test")
@Description("There are using Selenium tools in the suite")
public class MailRuTest extends TestBase {

    @Title("Loaded page")
    @Description("Loading personal e-mail page ")
    @Test
    @TestCaseId("1.1.3")
    public void gotoMailRu() {
        login.waitLoginPageAppear();
        String str = home.writeLetter();
        Assert.assertEquals(str, "Написать письмо");
    }

}