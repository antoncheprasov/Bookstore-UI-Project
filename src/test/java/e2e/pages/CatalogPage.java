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
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

public class CatalogPage {

    private SelenideElement searchBox = $(By.id("searchBox"));
    private SelenideElement searchButton = $(By.id("basic-addon2"));
    private SelenideElement tableOfBooks = $(By.className("rt-table"));
    private ElementsCollection tableRows = $$(By.className("rt-tr-group"));
    private ElementsCollection titleRows = $$(By.xpath("//span[@class='mr-2']"));
    private SelenideElement titleRowInBookTable = $(By.xpath
            ("//div[@class='rt-resizable-header-content'][text()='Title']"));
    private SelenideElement titleGitBook = $(By.id("see-book-Git Pocket Guide"));
    private SelenideElement titleLearningJavaScriptBook = $(By.id("see-book-Learning JavaScript Design Patterns"));
    private SelenideElement titleDesigningAPIBook = $(By.id("see-book-Designing Evolvable Web APIs with ASP.NET"));
    private SelenideElement titleSpeakingJavaScriptBook = $(By.id("see-book-Speaking JavaScript"));
    private SelenideElement titleYouDoNotKnowJSBook = $(By.id("see-book-You Don't Know JS"));
    private SelenideElement titleProgrammingJSAppsBook = $(By.id("see-book-Programming JavaScript Applications"));
    private SelenideElement titleEloquentJSBook = $(By.id("see-book-Eloquent JavaScript, Second Edition"));
    private SelenideElement titleUnderstandingECMAScriptBook = $(By.id("see-book-Understanding ECMAScript 6"));
    private SelenideElement backToBookStoreButton = $(By.xpath("//div[@class=\"text-left fullButton\"]"));
    private SelenideElement addBookToCollectionButton = $(By.xpath("//div[@class=\"text-right fullButton\"]"));
    private SelenideElement ISBNLabel = $(By.id("ISBN-label"));
    private SelenideElement titleLabel = $(By.id("title-label"));
    private SelenideElement authorLabel = $(By.id("author-label"));
    private SelenideElement publisherLabel = $(By.id("publisher-label"));
    private SelenideElement totalPages = $(By.id("pages-label"));
    private SelenideElement synopsisLabel = $(By.id("synopsis-label"));
    private SelenideElement yearOfPublication = $(By.id("yearOfPub-label"));
    private SelenideElement writeReviewForBookButton = $(By.id("writeReview"));
    private SelenideElement rateBookButton = $(By.id("rateBook"));
    private SelenideElement statusOfBook = $(By.id("book-status"));
    private SelenideElement pagesHeader = $(By.xpath("//div[@class='main-header']"));
    private SelenideElement sortButtonByAuthor = $(By.xpath("//div[@class='rt-resizable-header-content'][text()='Author']"));
    private SelenideElement sortButtonByTitle = $(By.xpath("//div[@class='rt-resizable-header-content'][text()='Title']"));
    private SelenideElement sortButtonByPublisher =
            $(By.xpath("//div[@class='rt-resizable-header-content'][text()='Publisher']"));
    private ElementsCollection booksTitleCollection = $$x("//div[@class='rt-td'][2]");
    private ElementsCollection booksAuthorCollection = $$x("//div[@class='rt-td'][3]");
    private ElementsCollection booksPublisherCollection = $$x("//div[@class='rt-td'][4]");

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


    public void clickOnBackToBookStoreButton() {
        backToBookStoreButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        backToBookStoreButton.click();
    }

    public void clickOnWriteReviewForBookButton() {
        writeReviewForBookButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        writeReviewForBookButton.click();
    }

    public void clickOnRateBookButton() {
        rateBookButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        rateBookButton.click();
    }

    public String checkStatusOfBook() {
        return statusOfBook.getText();
    }

    public void clickOnAddBookToCollection() {
        addBookToCollectionButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).scrollTo();
        addBookToCollectionButton.click();
    }

    public void clickInSearchField() {
        searchBox.shouldBe(Condition.visible, Duration.ofSeconds(10));
        searchBox.click();
    }

    public void clickOnSearchButton() {
        searchButton.shouldBe(Condition.visible, Duration.ofSeconds(10));
        searchButton.click();
    }


    public void checkTableExists() {
        tableOfBooks.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    public void enterRelevantSearchQuery(String relevantSearchValue) {
        searchBox.shouldBe(Condition.visible, Duration.ofSeconds(10));
        searchBox.setValue(relevantSearchValue);
    }

    public void checkRelevantSearchResultForQuery() {
        titleGitBook.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldHave(Condition.text("Git Pocket Guide"));

    }

    public void checkHeaderOnBookstorePage() {
        pagesHeader.shouldBe(Condition.visible, Duration.ofSeconds(10)).
                shouldHave(Condition.text("Book Store"));
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

}
