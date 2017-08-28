package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {

    private static final String BASE_USER = "seleniumtests10";
    private static final String PASSWORD = "060788avavav";

    @FindBy(id = "mailbox__login")
    private WebElement userName;

    @FindBy(id = "mailbox__password")
    private WebElement password;

    @FindBy(id = "mailbox__auth__button")
    private WebElement buttonLogin;

    @FindBy(id = "portal-menu")
    public WebElement menu;

    public void login() {
        userName.sendKeys(BASE_USER);
        password.sendKeys(PASSWORD);
        buttonLogin.click();

    }

}
