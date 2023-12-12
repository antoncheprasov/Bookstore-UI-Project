package e2e;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import e2e.pages.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    final String BASE_URL = "https://demoqa.com";

    @Before
    public void setUp(){
        //Configuration.timeout = 10000;
        //Configuration.browser = "firefox";
        //Configuration.browserSize = "300x300";
        // Configuration.headless = true;
        //Configuration.fastSetValue = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(BASE_URL);
        switchTo().window(0);
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }

    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    CatalogPage catalogPage = new CatalogPage();
    SideBarPage sideBarPage = new SideBarPage();
    ProfilePage profilePage = new ProfilePage();
}
