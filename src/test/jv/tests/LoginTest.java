package jv.tests;

import org.junit.Test;
import jv.setup.ChromeSetup;
import jv.modules.Menu;
import jv.modules.LogInForm;
import jv.modules.DikiFrontPage;
import jv.modules.RegistrationForm;
import org.openqa.selenium.WebDriver;

public class LoginTest extends ChromeSetup
{
    @Test
    public void checkLogIn() {

        DikiFrontPage dikiFrontPage = new DikiFrontPage(driver);
        dikiFrontPage.loadFrontPage();
        dikiFrontPage.openMenu();

        Menu menu = new Menu(driver);
        menu.clickLogiInButton();

        LogInForm form = new LogInForm(driver);
        form.fillLogInFormAndContinue();

        dikiFrontPage.openMenu();
        dikiFrontPage.assertThatUserIsLogged();
    }
}
