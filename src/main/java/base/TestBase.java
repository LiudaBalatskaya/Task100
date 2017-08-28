package base;

import Utilities.Driver;
import helpers.Waiter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;
import screenshot.Screenshot;

import static Utilities.Driver.driver;

@Listeners({Screenshot.class})
public class TestBase {

    protected static final String BASE_URL = "https://mail.ru/";
    public static LoginPage login;
    public static HomePage home;

    public static WebDriver getWebDriver() {
        return driver;
    }

    @Description("The test initializes the driver of the class")
    @BeforeClass
    public void setup() {
        Driver.Initialize();
    }

    @AfterClass
    public void exit() {
        Driver.close();
    }

    @Title("Open Mail.ru")
    @Description("The test worked before each method of the suite")
    @BeforeMethod
    public void gotoPage() {

        driver.get(BASE_URL);
        Waiter.waitAppearing("Mail.Ru: почта, поиск в интернете, новости, игры");
        login = new LoginPage();
        home = new HomePage();
    }

    @Title("Logout")
    @Description("The test worked after each method of the suite")
    @AfterMethod
    public void quit() {
        home.logout();
    }

}
