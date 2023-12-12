package e2e;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class CatalogTest extends BaseTest{

    @Test
    public void checkTableExists() {
        loginPage.clickBookStoreAppLink();
        catalogPage.checkHeaderOnBookstorePage();
        catalogPage.checkTableExists();
    }

    @Test
    public void checkExactSearchResults() {
        loginPage.clickBookStoreAppLink();
        catalogPage.clickInSearchField();
        catalogPage.enterRelevantSearchQuery("Git Pocket Guide");
        catalogPage.clickOnSearchButton();
        catalogPage.checkRelevantSearchResultForQuery();
    }

    @Test
    public void checkSearchResultsForPartNameOfBook() {
        loginPage.clickBookStoreAppLink();
        profilePage.clickInSearchField();
        profilePage.enterRelevantSearchQuery("Learning");
        profilePage.clickOnSearchButton();
        profilePage.checkPartWordsSearchResultForQuery();
    }

    @Test
    public void checkSearchResultsForQueryUsingNonExistingWords() {
        loginPage.clickBookStoreAppLink();
        profilePage.enterRelevantSearchQuery("tyehfgfh");
        profilePage.clickOnSearchButton();
        profilePage.checkSearchResultForQueryUsingNonExistingWords();
    }

    @Test
    public void viewBookDetails() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        catalogPage.clickOnGitBook();
        catalogPage.checkBookDetails();
    }


    @Test
    public void recommendedBooksPage() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        sideBarPage.clickOnRecommendedBooksLinkInSideBar();
    }

    @Test
    public void writingReviewForBook() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.clickOnGitBook();
        catalogPage.clickOnWriteReviewForBookButton();
    }

    @Test
    public void rateABook() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.clickOnGitBook();
        catalogPage.clickOnRateBookButton();
    }

    @Test
    public void checkingAvailabilityOfBook() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.clickOnGitBook();
        catalogPage.checkStatusOfBook();
    }

    @Test
    public void navigatingInCatalog() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.checkHeaderOnBookstorePage();
        sideBarPage.clickOnLoginLinkInSideBar();
        loginPage.checkHeaderOnLoginPage();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.checkHeaderOnProfilePage();
    }

    @Test
    public void sortBooksByAuthorNameAToZ() {
        loginPage.clickBookStoreAppLink();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.checkHeaderOnBookstorePage();
        catalogPage.clickOnAuthorSort();
        catalogPage.checkAuthorSortAtoZ();
    }

    @Test
    public void sortBooksByAuthorNameZToA() {
        loginPage.clickBookStoreAppLink();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.checkHeaderOnBookstorePage();
        catalogPage.clickOnAuthorSort();
        catalogPage.clickOnAuthorSort();
        catalogPage.checkAuthorSortZtoA();
    }

    @Test
    public void sortBooksByTitleAToZ() {
        loginPage.clickBookStoreAppLink();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.checkHeaderOnBookstorePage();
        catalogPage.clickOnTitleSort();
        catalogPage.checkTitleSortAtoZ();
    }

    @Test
    public void sortBooksByTitleZToA() {
        loginPage.clickBookStoreAppLink();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.checkHeaderOnBookstorePage();
        catalogPage.clickOnTitleSort();
        catalogPage.clickOnTitleSort();
        catalogPage.checkTitleSortZtoA();
    }

    @Test
    public void sortBooksByPublisherAToZ() {
        loginPage.clickBookStoreAppLink();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.checkHeaderOnBookstorePage();
        catalogPage.clickOnPublisherSort();
        catalogPage.checkPublisherSortAtoZ();
    }

    @Test
    public void sortBooksByPublisherZtoA() {
        loginPage.clickBookStoreAppLink();
        sideBarPage.clickOnBookStoreLinkInSidebar();
        catalogPage.checkHeaderOnBookstorePage();
        catalogPage.clickOnPublisherSort();
        catalogPage.clickOnPublisherSort();
        catalogPage.checkPublisherSortZtoA();
    }

}
