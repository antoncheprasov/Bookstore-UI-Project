package e2e.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    private SelenideElement registrationForm = $(By.className("register-wrapper"));
    private SelenideElement firstNameInputField = $("[placeholder=\"First Name\"]");
    private SelenideElement lastNameInputField = $("[placeholder=\"Last Name\"]");
    private SelenideElement eMailInputField = $("[placeholder=\"EMail\"]");
    private SelenideElement countryInputField = $("[placeholder=\"Country\"]");
    private SelenideElement cityInputField = $("[placeholder=\"City\"]");
    private SelenideElement passwordInputField = $("[placeholder=\"Password\"]");
    private SelenideElement confirmPasswordInputField = $("[placeholder=\"Confirm Password\"]");

    public void checkThatUserOnRegistrationPage() {
        registrationForm.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.text("Register to Book Store"));
    }

    public void checkFirstNameInputFieldExists() {
        firstNameInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void checkLastNameInputFieldExists() {
        lastNameInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void checkEMailInputFieldExists() {
        eMailInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void checkCountryFieldExists() {
        countryInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void checkCityFieldExists() {
        cityInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void checkPasswordInputFieldExists() {
        passwordInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void checkConfirmPasswordInputFieldExists() {
        confirmPasswordInputField.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

}
