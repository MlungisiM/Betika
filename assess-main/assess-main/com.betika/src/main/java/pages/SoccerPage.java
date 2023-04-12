package pages;

import common.DriverHandler;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class SoccerPage extends DriverHandler {
    //Page Objects
    @FindBy(xpath = "/html/body/div[2]/main/div/div[3]/div/div/div[2]/div/div[2]/div[7]/div[2]/div[2]/div/button[1]/span")
    WebElement bet;
    @FindBy(xpath = "//input[@type='number']")
    public WebElement amountTextbox;
    @FindBy(xpath = "//div[@id='slips']/div[2]/div/div[2]/button/span")
    public WebElement amountButton;
    @FindBy(xpath = "//div[2]/div[2]/div/button/span")
    WebElement teamselection;

    @FindBy(xpath = "//a[contains(text(),'Milan Vs. Napoli')]")
    public WebElement selectedOption;

    @FindBy(xpath = "//div[2]/div/div[2]/div/button/span")
    WebElement whichDay;

    @FindBy(xpath = "//button[5]")
    WebElement friday;
    WebDriverWait wait;

    //Initialize Page Objects
    public SoccerPage() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //Perform action on Page Objects
    public void clickBet() {
        bet.click();
    }
    public void enterAmount() {
        amountTextbox.sendKeys(Keys.BACK_SPACE + "" + Keys.BACK_SPACE + Keys.BACK_SPACE);
        amountTextbox.sendKeys("2");
    }

    public void placeBet() {
        amountButton.click();
    }

    public void clearamountTexbox() {
        amountTextbox.sendKeys(Keys.BACK_SPACE + "" + Keys.BACK_SPACE + "" + Keys.BACK_SPACE);
    }

    public void selectteam() {
        teamselection.click();
    }

    public void selectDay() {
        whichDay.click();
        friday.click();
    }
}
