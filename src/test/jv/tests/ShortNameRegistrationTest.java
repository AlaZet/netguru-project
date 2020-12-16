package jv.tests;

import org.junit.Test;
import jv.modules.Menu;
import jv.setup.ChromeSetup;
import jv.modules.DikiFrontPage;
import jv.modules.RegistrationForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShortNameRegistrationTest extends ChromeSetup {
    
    @Test
    public void checkShortNameRegistration() {

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
