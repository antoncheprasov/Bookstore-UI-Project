package e2e.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$x;
import static java.util.Collections.*;

public class ProfilePage {

    private SelenideElement logOutButton = $(By.xpath("//button[@id='submit'][text()='Log out']"));

    private SelenideElement searchBox = $(By.id("searchBox"));
    private SelenideElement searchButton = $(By.id("basic-addon2"));
    private SelenideElement tableOfBooks = $(By.className("rt-table"));
    private ElementsCollection tableRows = $$(By.className("rt-tr-group"));
    private SelenideElement titleRowInBookTable = $(By.xpath
            ("//div[@class='rt-td'][2]"));
    private SelenideElement titleGitBook = $(By.id("see-book-Git Pocket Guide"));
    private SelenideElement titleLearningJavaScriptBook = $(By.id("see-book-Learning JavaScript Design Patterns"));
    private SelenideElement titleDesigningAPIBook = $(By.id("see-book-Designing Evolvable Web APIs with ASP.NET"));
    private SelenideElement titleSpeakingJavaScriptBook = $(By.id("see-book-Speaking JavaScript"));
    private SelenideElement titleYouDoNotKnowJSBook = $(By.id("see-book-You Don't Know JS"));
    private SelenideElement titleProgrammingJSAppsBook = $(By.id("see-book-Programming JavaScript Applications"));
    private SelenideElement titleEloquentJSBook = $(By.id("see-book-Eloquent JavaScript, Second Edition"));
    private SelenideElement titleUnderstandingECMAScriptBook = $(By.id("see-book-Understanding ECMAScript 6"));
    private SelenideElement deleteBook = $(By.id("delete-record-undefined"));
    private SelenideElement deleteBookConfirmation = $(By.id("closeSmallModal-ok"));
    private SelenideElement deleteBookCancel = $(By.id("closeSmallModal-cancel"));
    private SelenideElement backToBookStoreButton = $(By.xpath("//div[@class=\"text-left fullButton\"]"));
    private SelenideElement ISBNLabel = $(By.id("ISBN-label"));
    private SelenideElement titleLabel = $(By.id("title-label"));
    private SelenideElement authorLabel = $(By.id("author-label"));
    private SelenideElement publisherLabel = $(By.id("publisher-label"));
    private SelenideElement totalPages = $(By.id("pages-label"));
    private SelenideElement synopsisLabel = $(By.id("synopsis-label"));
    private SelenideElement yearOfPublication = $(By.id("yearOfPub-label"));
    private SelenideElement pagesHeader = $(By.xpath("//div[@class='main-header']"));
    private SelenideElement sortButtonByAuthor = $(By.xpath("//div[@class='rt-resizable-header-content'][text()='Author']"));
    private SelenideElement sortButtonByTitle = $(By.xpath("//div[@class='rt-resizable-header-content'][text()='Title']"));
    private SelenideElement sortButtonByPublisher =
            $(By.xpath("//div[@class='rt-resizable-header-content'][text()='Publisher']"));
    private ElementsCollection booksTitleCollection = $$x("//div[@class='rt-td'][2]");
    private ElementsCollection booksAuthorCollection = $$x("//div[@class='rt-td'][3]");
    private ElementsCollection booksPublisherCollection = $$x("//div[@class='rt-td'][4]");
    private SelenideElement deleteAllBooksButton = $(By.xpath
            ("//div[@class='text-right button di']"));
    private SelenideElement iframe = $(By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0"));
    private SelenideElement deleteAccount = $(By.xpath
            ("//button[@id='submit' and contains(text(), 'Delete Account')]"));



    public void deleteAllBooksFromProfile() {
        deleteAllBooksButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        switchTo().frame(iframe);

        deleteAllBooksButton.click();
        switchTo().defaultContent();
    }
    public void deleteAccount() {
        deleteAccount.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        deleteAccount.click();
    }

    public void clickOnLogOutButton() {
        logOutButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        logOutButton.click();
    }

    public void checkHeaderOnProfilePage() {
        pagesHeader.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.text("Profile"));
    }

    public void clickInSearchField() {
        searchBox.shouldBe(Condition.visible, Duration.ofSeconds(10));
        searchBox.click();
    }

    public void clickOnSearchButton() {
        searchButton.shouldBe(Condition.visible, Duration.ofSeconds(10));
        searchButton.click();
    }

    public void clickOnLogoToDeleteBookFromCollection() {
        deleteBook.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        deleteBook.click();
    }

    public void clickOnOKWhenDeletingBook() {
        deleteBookConfirmation.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        deleteBookConfirmation.click();
    }

    public void clickOnCancelWhenDeletingBok() {
        deleteBookCancel.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        deleteBookCancel.click();
    }

    public void clickOnBackToBookStoreButton() {
        backToBookStoreButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        backToBookStoreButton.click();

    }

    public void tableHasRows() {
        for (SelenideElement rows : tableRows) {
            rows.shouldBe(Condition.visible);
        }
    }

    public void checkTableExists() {
        tableOfBooks.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void enterRelevantSearchQuery(String relevantSearchValue) {
        searchBox.shouldBe(Condition.visible, Duration.ofSeconds(10));
        searchBox.setValue(relevantSearchValue);
    }

    public void checkRelevantSearchResultForQuery() {
        titleRowInBookTable.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.text("Git Pocket Guide"));
    }

    public void checkPartWordsSearchResultForQuery() {
        titleRowInBookTable.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.partialText("Learning"));
    }

    public void checkSearchResultForQueryUsingNonExistingWords() {
        titleRowInBookTable.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.partialText("tyehfgfh"));
    }


    public void checkBookDetails() {
        ISBNLabel.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldHave(Condition.text("ISBN"));
        titleLabel.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldHave(Condition.text("Title"));
        authorLabel.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldHave(Condition.text("Author"));
        publisherLabel.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldHave(Condition.text("Publisher"));
        totalPages.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldHave(Condition.text("Total Pages"));
        synopsisLabel.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldHave(Condition.text("Synopsis"));
        yearOfPublication.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldHave(Condition.text("Year Of Publication"));
    }

    public void clickOnGitBook() {
        titleGitBook.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleGitBook.click();
    }

    public void clickOnLearningJavaScriptBook() {
        titleLearningJavaScriptBook.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleLearningJavaScriptBook.click();
    }

    public void clickOnDesigningAPIBook() {
        titleDesigningAPIBook.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleDesigningAPIBook.click();
    }

    public void clickOnSpeakingJavaScriptBook() {
        titleSpeakingJavaScriptBook.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleSpeakingJavaScriptBook.click();
    }

    public void clickOnYouDoNotKnowJSBook() {
        titleYouDoNotKnowJSBook.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleYouDoNotKnowJSBook.click();
    }

    public void clickOnProgrammingJSAppsBook() {
        titleProgrammingJSAppsBook.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleProgrammingJSAppsBook.click();
    }

    public void clickOnEloquentJSBook() {
        titleEloquentJSBook.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleEloquentJSBook.click();
    }

    public void clickOnUnderstandingECMAScriptBook() {
        titleUnderstandingECMAScriptBook.shouldBe(Condition.visible, Duration.ofSeconds(10));
        titleUnderstandingECMAScriptBook.click();
    }


    public void clickOnTitleSort() {
        sortButtonByTitle.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        sortButtonByTitle.click();
    }

    public void clickOnAuthorSort() {
        sortButtonByAuthor.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        sortButtonByAuthor.click();
    }

    public void clickOnPublisherSort() {
        sortButtonByPublisher.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        sortButtonByPublisher.click();
    }

    public boolean checkTitleSortAtoZ () {
        List<String> actualNames = new ArrayList<>();
        for (WebElement name : booksTitleCollection) {
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        return actualNames.equals(expectedNames);
    }

    public boolean checkTitleSortZtoA () {
        List<String> actualNames = new ArrayList<>();
        for (WebElement name : booksTitleCollection) {
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames, reverseOrder());
        return actualNames.equals(expectedNames);
    }

    public boolean checkAuthorSortAtoZ () {
        List<String> actualNames = new ArrayList<>();
        for (WebElement name : booksAuthorCollection) {
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        return actualNames.equals(expectedNames);
    }

    public boolean checkAuthorSortZtoA () {
        List<String> actualNames = new ArrayList<>();
        for (WebElement name : booksAuthorCollection) {
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames, reverseOrder());
        return actualNames.equals(expectedNames);
    }

    public boolean checkPublisherSortAtoZ () {
        List<String> actualNames = new ArrayList<>();
        for (WebElement name : booksPublisherCollection) {
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        return actualNames.equals(expectedNames);
    }

    public boolean checkPublisherSortZtoA () {
        List<String> actualNames = new ArrayList<>();
        for (WebElement name : booksPublisherCollection) {
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames, reverseOrder());
        return actualNames.equals(expectedNames);
    }
}
