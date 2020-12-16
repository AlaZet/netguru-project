package jv.modules;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class RegistrationForm extends DikiFrontPage {

    @FindBy(id = "fname")
    private WebElement nameField;

    @FindBy(id = "lname")
    private WebElement surnameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "username")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "regulamin")
    private WebElement termsCheckbox;

    @FindBy(className = "buttonText")
    private WebElement createAccountButton;

    @FindBy(xpath = "//*[contains(text(), 'Wpisane imię')]")
    private WebElement errorMessage;

    public RegistrationForm (org.openqa.selenium.WebDriver driver) {
        super(driver);
    }

    public void fillRegistrationFormAndContinue() {
        Random randomNumber = new Random();
        String name = ".";
        String testSurname = "Orion";
        String testPassword = "lubi_treatsy!";
        String letters = "abcdefghijklmnoprstuwxyz";

        for(int i = 0, n = 8; i < n; ++i)
        {
            testSurname = testSurname + letters.charAt(randomNumber.nextInt(23));
        }

        nameField.sendKeys(name);
        surnameField.sendKeys(testSurname);
        emailField.sendKeys(name + randomNumber.nextInt(100000) + "@bordercollie.com");
        loginField.sendKeys(name + randomNumber.nextInt(100000));
        passwordField.sendKeys(testPassword);
        termsCheckbox.click();
        createAccountButton.click();
    }

    public void assertNameFieldValidation() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
    }
}
