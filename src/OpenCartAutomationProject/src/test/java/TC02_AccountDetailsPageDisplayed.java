import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Account;
import pages.ExcelReader;
import pages.Login;

import java.util.Properties;

public class TC02_AccountDetailsPageDisplayed extends DriverFactory{

    ExcelReader td = new ExcelReader();
    ConfigReader configreader = new ConfigReader();
    Properties prop =  configreader.init_prop();
    String url2 = prop.getProperty("url");
    Login loginPage;
    Account accountPage;
    //static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        loginPage = new Login(driver);
        accountPage = new Account(driver);
    }
    @Test
    public void  validateAccountPageDisplayed() throws Throwable {
        td.xcelReader("OpenCart.xlsx");
        String Email = td.getCellData("Login", "Email", 2);
        String Pswd = td.getCellData("Login", "Pswd", 2);
        String Token = td.getCellData("Login", "Token", 2);
        driver.get(url2);
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
        accountPage.ValidateAccountDetailsPageDisplayed();
    }
}