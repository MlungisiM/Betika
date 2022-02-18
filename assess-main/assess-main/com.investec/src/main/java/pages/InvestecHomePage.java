package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.DriverHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InvestecHomePage extends DriverHandler {
    //Page Objects
    @FindBy(id = "searchBarInput")
    WebElement searchBarInput;
    @FindBy(xpath = "//*[@id='search-toggle']")
    WebElement searchIcon;
    @FindBy(id = "searchBarButton")
    WebElement searchBarButton;

    WebDriverWait wait;

    //Initialize Page Objects
    public InvestecHomePage() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //Perform action on Page Objects
    public void populateSearchBar(String searchCriteria) {
        searchBarInput.sendKeys(searchCriteria);
    }

    public void clickSearchIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
    }

    public SearchResultsPage clickSearchButton() {
        searchBarButton.click();
        return new SearchResultsPage();
    }
}
