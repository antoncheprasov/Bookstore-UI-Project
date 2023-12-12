package e2e.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class SideBarPage {


    private SelenideElement bookStoreLinkInSideBar = $(By.xpath("//span[@class='text'][text()='Book Store']"));
    private SelenideElement profileLinkInSideBar = $(By.xpath("//span[@class='text'][text()='Profile']"));
    private SelenideElement loginLinkInSideBar = $(By.xpath("//span[@class='text'][text()='Login']"));
    private SelenideElement recommendedBooksLink = $(By.xpath("//span[@class='text'][text()='Recommended Books']"));

    public void clickOnBookStoreLinkInSidebar() {
        bookStoreLinkInSideBar.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        bookStoreLinkInSideBar.click();
    }

    public void clickOnProfileLinkInSideBar() {
        profileLinkInSideBar.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        profileLinkInSideBar.click();
    }

    public void clickOnLoginLinkInSideBar() {
        loginLinkInSideBar.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        loginLinkInSideBar.click();
    }

    public void clickOnRecommendedBooksLinkInSideBar() {
        recommendedBooksLink.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        recommendedBooksLink.click();
    }
}
