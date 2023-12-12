package e2e;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class LoginTest extends BaseTest{

    @Test @Category(Smoke.class)
    public void successLogin() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
    }

    @Test
    public void loginWithInvalidPassword() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("jxioxo");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage().shouldBe(Condition.visible).shouldHave(Condition.text("Invalid username or password!"));
    }

    @Test
    public void loginWithInvalidUsername() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("xoxoxo");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage().shouldBe(Condition.visible).shouldHave(Condition.text("Invalid username or password!"));
    }

    @Test
    public void loginWithEmptyUserNameField() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkHoverTextInUserNameInputField();
    }

    @Test
    public void loginWithEmptyPasswordField() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.clickOnLoginButton();
        loginPage.checkHoverTextInPasswordInputField();
    }

    @Test
    public void loginWithEmptyFields() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.clickOnLoginButton();
        loginPage.checkHoverTextInUserNameInputField();
        loginPage.checkHoverTextInPasswordInputField();
    }

    @Test
    public void redirectToRegistrationPage() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.checkThatUserOnLoginPage();
        loginPage.clickOnNewUserButton();
        registrationPage.checkThatUserOnRegistrationPage();
    }


}
