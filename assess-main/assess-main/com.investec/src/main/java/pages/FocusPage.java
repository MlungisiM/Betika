package pages;

import common.DriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FocusPage extends DriverHandler {
    //Page Objects
    @FindBy(xpath = "//button[@class='forms__submit cta-primary']")
    WebElement submitButton;
    @FindBy(xpath = "//button[contains(@class,'button-primary content-hub-form-container__button')]")
    WebElement signUpButton;
    @FindBy(name = "name")
    WebElement nameTextbox;
    @FindBy(name = "surname")
    WebElement surnameTextbox;
    @FindBy(name = "email")
    WebElement emailTextbox;
    @FindBy(xpath = "//h3[text()='Thank you']")
    WebElement signUpSuccessMessage;
    WebDriverWait wait;

    //Initialize Page Objects
    public FocusPage() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void enterName(String name) {
        wait.until(ExpectedConditions.visibilityOf(nameTextbox)).sendKeys(name);
    }

    public void enterSurname(String surname) {
        surnameTextbox.sendKeys(surname);
    }

    public void enterEmail(String email) {
        emailTextbox.sendKeys(email);
    }

    public void selectReceiveInsightOption() {
        WebElement element = driver.findElement(By.xpath("//button[@type='button']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickSignUpButton() {
        WebElement element = driver.findElement(By.xpath("//button[contains(@class,'button-primary content-hub-form-container__button')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickSubmitButton() {
        WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public boolean successMessageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOf(signUpSuccessMessage)).isDisplayed();
    }
}
