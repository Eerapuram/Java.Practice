import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Account;
import pages.EditAccountDetails;
import pages.ExcelReader;
import pages.Login;

import java.util.Properties;

public class TC07_ValidateEditAccountDetailsSuccessful extends DriverFactory{

    ExcelReader td = new ExcelReader();
    ConfigReader configreader = new ConfigReader();
    Properties prop = configreader.init_prop();
    String url2 = prop.getProperty("url");
    public Login loginPage;
    public Account accountPage;
    public EditAccountDetails editAccountDetailsPage;
    //static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        loginPage = new Login(driver);
        accountPage = new Account(driver);
        editAccountDetailsPage = new EditAccountDetails(driver);
    }
    @Test
    public void validateEditAccountDetails() throws Throwable {

        td.xcelReader("OpenCart.xlsx");

        String Email = td.getCellData("Login", "Email", 2);
        String Pswd = td.getCellData("Login", "Pswd", 2);
        String Token = td.getCellData("Login", "Token", 2);
        String UserName = td.getCellData("EditAccountDetails", "UserNmae", 2);
        String FirstName = td.getCellData("EditAccountDetails", "FirstName", 2);
        String LastName = td.getCellData("EditAccountDetails", "LastName", 2);
        String Company = td.getCellData("EditAccountDetails", "Company", 2);
        String Tax = td.getCellData("EditAccountDetails", "Tax", 2);
        String email = td.getCellData("EditAccountDetails", "email", 2);

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
        accountPage.ValidateAccountDetailsLinkEnabled();
        accountPage.clickAccountDetails();
        editAccountDetailsPage.validateEditAccountdetailsDisplayed();
        editAccountDetailsPage.validateUserNameDisplayed();
        //editAccountDetailsPage.enterUserName("rgfng");
        editAccountDetailsPage.enterUserName(UserName);
        editAccountDetailsPage.validateFirstNameDisplayed();
        //editAccountDetailsPage.enterFirstName("yui");
        editAccountDetailsPage.enterFirstName(FirstName);
        editAccountDetailsPage.validateLastNameDisplayed();
        //editAccountDetailsPage.enterLastName("chi");
        editAccountDetailsPage.enterLastName(LastName);
        editAccountDetailsPage.validateCompanyNameDisplayed();
        //editAccountDetailsPage.enterCompanyName("Qualitest");
        editAccountDetailsPage.enterCompanyName(Company);
        editAccountDetailsPage.validateTaxNameDisplayed();
        //editAccountDetailsPage.enterTax("999");
        editAccountDetailsPage.enterTax(Tax);
        editAccountDetailsPage.validateUserEmail1Displayed();
        //editAccountDetailsPage.enterUserEmail("eashishkumar2000@gmail.com");
        editAccountDetailsPage.enterUserEmail(email);
        editAccountDetailsPage.validateCountryEnabled();
        editAccountDetailsPage.selectCountry();
        editAccountDetailsPage.validateRadioButtonDisplayed();
        editAccountDetailsPage.selectRadioButton();
        editAccountDetailsPage.validateSubmitButtonDisplayed();
        editAccountDetailsPage.clickSubmitButton();
        editAccountDetailsPage.ValidateEditAccountDetailsSuccesful();
    }

}