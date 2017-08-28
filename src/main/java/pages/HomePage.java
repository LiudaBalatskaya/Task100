package pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public final By LOGOUT = By.id("PH_logoutLink");
    public final By WRITING = By.cssSelector("a>.b-toolbar__btn__text.b-toolbar__btn__text_pad");

    public HomePage() {
        this.driver = Driver.driver;
    }

    public String writeLetter() {
        return driver.findElement(WRITING).getText();
    }

    public void logout() {
        driver.findElement(LOGOUT).click();
    }
}
