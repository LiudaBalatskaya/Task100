package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory {

    @FindBy(id = "ScrollBodyInner")
    public WebElement letters;

    @FindBy(id = "PH_logoutLink")
    private WebElement logout;

    @FindBy(id = "portal-menu")
    private WebElement menu;

    public String portalMenu() {
        return menu.getAttribute("data-mnemo");
    }

    public void putLogout() {
        logout.click();
    }

}
