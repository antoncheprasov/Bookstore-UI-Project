package e2e;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class RegistrationTest extends BaseTest{

    @Test
    @Category(Smoke.class)
    public void checkExistingFieldsUponRegistration() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.clickOnNewUserButton();
        registrationPage.checkThatUserOnRegistrationPage();
        registrationPage.checkFirstNameInputFieldExists();
        registrationPage.checkLastNameInputFieldExists();
        registrationPage.checkEMailInputFieldExists();
        registrationPage.checkCountryFieldExists();
        registrationPage.checkCityFieldExists();
        registrationPage.checkPasswordInputFieldExists();
        registrationPage.checkConfirmPasswordInputFieldExists();
    }

}
