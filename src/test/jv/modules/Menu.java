package jv.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu extends DikiFrontPage {

    @FindBy(partialLinkText = "konto")
    private WebElement registerButton;

    @FindBy(partialLinkText = "Zaloguj")
    private WebElement logInButton;

    public Menu (org.openqa.selenium.WebDriver driver) {
        super(driver);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void clickLogiInButton(){
        logInButton.click();
    }
}
