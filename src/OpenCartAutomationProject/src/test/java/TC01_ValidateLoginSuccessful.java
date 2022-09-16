import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ExcelReader;
import pages.Login;

import java.util.Properties;

public class TC01_ValidateLoginSuccessful extends DriverFactory {

    ExcelReader td = new ExcelReader();
    ConfigReader configreader = new ConfigReader();
    Properties prop = configreader.init_prop();
    String appUrl = prop.getProperty("url");
    Login loginPage;
    //static WebDriver driver;
    @BeforeMethod
    public void setUp(){

        loginPage = new Login(driver);
    }
    @Test
    public void launchApplication() throws Throwable {

        td.xcelReader("OpenCart.xlsx");
        String Email = td.getCellData("Login", "Email", 2);
        String Pswd = td.getCellData("Login", "Pswd", 2);
        String Token = td.getCellData("Login", "Token", 2);
        System.out.println(Token);

        driver.get(appUrl);
        loginPage.validateUserEmailDisplayed();
        //loginPage.enterUserEmail("eashishkumar2000@gmail.com");
        loginPage.enterUserEmail(Email);
        loginPage.validateUserPasswordDisplayed();
        //loginPage.enterUserPassword("Abc@123");
        loginPage.enterUserPassword(Pswd);
        loginPage.validateLoginButtonEnabled();
        loginPage.clickLoginButton();
        loginPage.validatePinDisplay();
        //loginPage.enterTokenPin("8055");
        loginPage.enterTokenPin(Token);
        loginPage.validateContinueButtonEnabled();
        loginPage.clickContinueButton();
        loginPage.validateLoginPageDisplayed();
    }
}