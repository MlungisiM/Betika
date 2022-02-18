import common.DriverHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FocusPage;
import pages.InvestecHomePage;
import pages.SearchResultsPage;

public class InvestecWebsite extends DriverHandler {
    String email = getProp().getProperty("email");
    String searchCriteria = getProp().getProperty("search.criteria");
    String name = getProp().getProperty("name");
    String surname = getProp().getProperty("surname");

    InvestecHomePage homePage;
    SearchResultsPage searchResultsPage;
    FocusPage focusPage;

    @BeforeMethod
    public void setUp() {
        startBrowser();
        homePage = new InvestecHomePage();
    }

    @Test
    public void signUp() {
        homePage.clickSearchIcon();
        homePage.populateSearchBar(searchCriteria);
        searchResultsPage = homePage.clickSearchButton();
        focusPage = searchResultsPage.selectSearchResultOption();
        focusPage.clickSignUpButton();
        focusPage.enterName(name);
        focusPage.enterSurname(surname);
        focusPage.enterEmail(email);
        focusPage.selectReceiveInsightOption();
        focusPage.clickSubmitButton();
        Assert.assertTrue(focusPage.successMessageDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
