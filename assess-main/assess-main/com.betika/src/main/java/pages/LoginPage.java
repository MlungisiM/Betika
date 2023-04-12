package pages;

import common.DriverHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage extends DriverHandler {
    //Page Objects
    @FindBy(xpath = "//input[@type='text']")
    WebElement phonenumberTextbox;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordTextbox;
    @FindBy(xpath = "//span[@class='checkmark']")
    WebElement checkbox;
    @FindBy(xpath = "//button[contains(@class, 'login')]")
    WebElement loginButton;
    @FindBy(xpath = "//div[@id='notifications-root']/div/div")
    public WebElement successmessage;
    WebDriverWait wait;

    //Initialize Page Objects
    public LoginPage() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void enterPhonenumber(String phone) {
        wait.until(ExpectedConditions.visibilityOf(phonenumberTextbox)).sendKeys(phone);
    }
    public void enterPassword(String pass) {
        passwordTextbox.sendKeys(pass);
    }
    public void clickCheckbox() {
        checkbox.click();
    }
    public void clickLoginbutton() {
        loginButton.click();
    }

}
