package e2e.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class LoginPage {

    private SelenideElement bookStoreAppLinkFromMain = $(By.xpath("//div[@class='card mt-4 top-card'][6]"));
    private SelenideElement loginLinkButton = $(By.id("login"));
    private SelenideElement usernameInputField = $(By.id("userName"));
    private SelenideElement passwordInputField = $(By.id("password"));
    private SelenideElement loginButton = $(By.xpath("//div[@class='text-right button'][1]"));
    private SelenideElement errorMessageWhenLogin = $(By.id("output"));
    private SelenideElement userNameValueText = $(By.id("userName-value"));
    private SelenideElement usernameHoverText = $(By.id("userName"));
    private SelenideElement passwordHoverText = $(By.id("password"));
    private SelenideElement loginForm = $(By.className("login-wrapper"));
    private SelenideElement newUserButton = $(By.id("newUser"));
    private SelenideElement pagesHeader = $(By.xpath("//div[@class='main-header']"));

    public void checkHeaderOnLoginPage() {
        pagesHeader.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.text("Login"));
    }

    public SelenideElement getErrorMessage() {
        return errorMessageWhenLogin;
    }


    public void clickBookStoreAppLink() {
        bookStoreAppLinkFromMain.click();
    }

    public void clickOnLoginButtonLink() {
        loginLinkButton.shouldBe(Condition.visible, Duration.ofSeconds(10));
        loginLinkButton.click();
    }

    public void enterUsername(String usernameValue) {
        usernameInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
        usernameInputField.setValue(usernameValue);
    }

    public void enterPassword(String passwordValue) {
        passwordInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
        passwordInputField.setValue(passwordValue);
    }

    public void clickOnLoginButton() {
        loginButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo().click();
    }

    public void clickOnNewUserButton() {
        newUserButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo().click();
    }

    public void checkPageHasUsernameText() {
        userNameValueText.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.text("13ccedd6-1c89-42e7-ab19-bbc0743b5584"));

    }

    public void checkThatUserOnLoginPage() {
        loginForm.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.text("Login in Book Store"));
    }


    public void checkHoverTextInUserNameInputField(){
        usernameHoverText.shouldHave
                (attribute("validationMessage", "Please fill out this field."));
    }

    public void checkHoverTextInPasswordInputField(){
        passwordHoverText.shouldHave
                (attribute("validationMessage", "Please fill out this field."));
    }
}
