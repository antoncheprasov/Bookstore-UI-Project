package e2e;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class ProfileTest extends BaseTest {

    @Test
    public void successLogoutFromUserProfile() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        catalogPage.checkHeaderOnBookstorePage();
        profilePage.clickOnLogOutButton();
        loginPage.checkHeaderOnLoginPage();
    }

    @Test
    public void addingBookToUserCollection() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        catalogPage.clickOnGitBook();
        catalogPage.clickOnAddBookToCollection();
        switchTo().alert().accept();
    }


    @Test
    public void deletingBookFromUserCollection() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.clickOnLogoToDeleteBookFromCollection();
        profilePage.clickOnOKWhenDeletingBook();
        switchTo().alert().accept();
    }

    @Test
    public void deletingAllBooksFromUserCollection() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.deleteAllBooksFromProfile();
        switchTo().alert().accept();
    }

    @Test
    public void sortBooksByAuthorNameAToZ() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.checkHeaderOnProfilePage();
        profilePage.clickOnAuthorSort();
        profilePage.checkAuthorSortAtoZ();
    }

    @Test
    public void sortBooksByAuthorNameZToA() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.checkHeaderOnProfilePage();
        profilePage.clickOnAuthorSort();
        profilePage.clickOnAuthorSort();
        profilePage.checkAuthorSortZtoA();
    }

    @Test
    public void sortBooksByTitleAToZ() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.checkHeaderOnProfilePage();
        profilePage.clickOnTitleSort();
        profilePage.checkTitleSortAtoZ();
    }

    @Test
    public void sortBooksByTitleZToA() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.checkHeaderOnProfilePage();
        profilePage.clickOnTitleSort();
        profilePage.clickOnTitleSort();
        profilePage.checkTitleSortZtoA();
    }

    @Test
    public void sortBooksByPublisherAToZ() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.checkHeaderOnProfilePage();
        profilePage.clickOnPublisherSort();
        profilePage.checkPublisherSortAtoZ();
    }

    @Test
    public void sortBooksByPublisherZtoA() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.checkHeaderOnProfilePage();
        profilePage.clickOnPublisherSort();
        profilePage.clickOnPublisherSort();
        profilePage.checkPublisherSortZtoA();
    }

    @Test
    public void checkSearchResultsForExactBook() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.clickInSearchField();
        profilePage.enterRelevantSearchQuery("Git Pocket Guide");
        profilePage.clickOnSearchButton();
        profilePage.checkRelevantSearchResultForQuery();
    }

    @Test
    public void checkSearchResultsForPartNameOfBook() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.clickInSearchField();
        profilePage.enterRelevantSearchQuery("Learning");
        profilePage.clickOnSearchButton();
        profilePage.checkPartWordsSearchResultForQuery();
    }

    @Test
    public void checkSearchResultsForQueryUsingNonExistingWords() {
        loginPage.clickBookStoreAppLink();
        loginPage.clickOnLoginButtonLink();
        loginPage.enterUsername("13ccedd6-1c89-42e7-ab19-bbc0743b5584");
        loginPage.enterPassword("j4RMm9B*L");
        loginPage.clickOnLoginButton();
        loginPage.checkPageHasUsernameText();
        sideBarPage.clickOnProfileLinkInSideBar();
        profilePage.clickInSearchField();
        profilePage.enterRelevantSearchQuery("tyehfgfh");
        profilePage.clickOnSearchButton();
        profilePage.checkSearchResultForQueryUsingNonExistingWords();
    }

}
