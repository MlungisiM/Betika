package pages;

import common.DriverHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage extends DriverHandler {
    //Page Objects
    @FindBy(xpath = "//*[text()='Understanding']/following-sibling::b")
    WebElement searchResult;
    WebDriverWait wait;

    //Initialize Page Objects
    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public FocusPage selectSearchResultOption() {
        wait.until(ExpectedConditions.elementToBeClickable(searchResult)).click();
        return new FocusPage();
    }

}
