package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.HomePageFactory;
import pages.LoginPageFactory;
import screenshot.Screenshot;

import java.util.concurrent.TimeUnit;

@Listeners({Screenshot.class})
public class TestBaseFactory {

    private static final int DEFAULT_TIME_OUT = 50;
    protected static final String BASE_URL = "https://mail.ru/";
    protected WebDriver driver;
    public static HomePageFactory home;
    public static LoginPageFactory login;

    public WebDriverWait getWaiter() {
        return new WebDriverWait(driver, DEFAULT_TIME_OUT);
    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
    }

    @AfterClass
    public void exit() {
        driver.close();
    }

    @BeforeMethod
    public void initPages() {
        home = PageFactory.initElements(driver, HomePageFactory.class);
        login = PageFactory.initElements(driver, LoginPageFactory.class);
    }

    @AfterMethod
    public void logout() {
        home.putLogout();
    }

}
