package jv.modules;

import jv.setup.PageBase;
import jv.modules.RegistrationForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DikiFrontPage extends PageBase {

    String baseURL = "https://diki.pl";

    @FindBy(id = "thinHeaderMenuIcon")
    public WebElement burgerMenu;

    @FindBy(className = "userAvatarImage")
    private WebElement userAvatar;

    public DikiFrontPage(org.openqa.selenium.WebDriver driver) {
        super(driver);
    }

    public void loadFrontPage(){
        driver.get(baseURL);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(burgerMenu));
    }

    public void openMenu(){
        burgerMenu.click();
    }

    public void assertThatUserIsLogged(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(userAvatar));
    }
}
