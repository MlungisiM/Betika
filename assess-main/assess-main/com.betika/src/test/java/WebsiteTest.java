import common.DriverHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SoccerPage;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterMethod;

public class WebsiteTest extends DriverHandler {
    String soccermatches = getProp().getProperty("url.soccermatches");
    String login = getProp().getProperty("url.login");
    String PhoneNumber = getProp().getProperty("phonenumber");
    String passWord = getProp().getProperty("password");
    LoginPage loginPage;
    SoccerPage soccerpage;

    @BeforeMethod
    public void setUp() {

        startBrowser();
        loginPage = new LoginPage();
        soccerpage = new SoccerPage();
    }

    @Test(priority = 1)
    public void loggingin() {
        driver.get(login);
        loginPage.enterPhonenumber(PhoneNumber);
        loginPage.enterPassword(passWord);
        loginPage.clickCheckbox();
        loginPage.clickLoginbutton();
        Assert.assertTrue(loginPage.successmessage.isDisplayed());
    }

    @Test(priority = 2)
    public void PlaceBet() {
        driver.get(soccermatches);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //soccerpage.selectDay();
        soccerpage.selectteam();
        soccerpage.clearamountTexbox();
        soccerpage.enterAmount();
        soccerpage.placeBet();
        loginPage.enterPhonenumber(PhoneNumber);
        loginPage.enterPassword(passWord);
        loginPage.clickCheckbox();
        loginPage.clickLoginbutton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertTrue(soccerpage.selectedOption.isDisplayed());
    }
    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}