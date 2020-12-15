package jv.tests;

import org.junit.Test;
import jv.setup.ChromeSetup;
import jv.modules.Menu;
import jv.modules.DikiFrontPage;
import jv.modules.RegistrationForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewUserRegistrationTest extends ChromeSetup
{
    @Test
    public void checkNewUserRegistration() {

        DikiFrontPage dikiFrontPage = new DikiFrontPage(driver);
        dikiFrontPage.loadFrontPage();
        dikiFrontPage.openMenu();

        Menu menu = new Menu(driver);
        menu.clickRegisterButton();

        RegistrationForm form = new RegistrationForm(driver);
        form.fillRegistrationFormAndContinue();
        form.assertNameFieldValidation();
    }
}
