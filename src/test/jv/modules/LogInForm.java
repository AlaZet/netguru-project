package jv.modules;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LogInForm extends DikiFrontPage {

    @FindBy(id = "login")
    private WebElement loginField;

    @FindBy(id = "haslo")
    private WebElement passwordField;

    @FindBy(className = "formSubmitButton")
    private WebElement signInButton;

    public LogInForm (org.openqa.selenium.WebDriver driver) {
        super(driver);

    }

    public void fillLogInFormAndContinue() {
        String login = "randomtest+rr@gmail.com";
        String password = "1supersecret!";

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
    }
}
