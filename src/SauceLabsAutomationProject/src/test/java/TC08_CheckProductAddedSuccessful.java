import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ExcelReader;
import pages.Login;
import pages.Products;
import pages.YourCart;

import java.util.Properties;

public class TC08_CheckProductAddedSuccessful extends DriverFactory{

    ExcelReader td = new ExcelReader();
    ConfigReader configreader = new ConfigReader();
    Properties prop = configreader.init_prop();
    String appUrl = prop.getProperty("url");
    public Login loginPage;
    public Products productsPage;
    public YourCart yourCart;
    //static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        loginPage = new Login(driver);
        productsPage = new Products(driver);
        yourCart = new YourCart(driver);
    }
    @Test
    public void checkProductAddedSuccessful() throws Throwable {

        td.xcelReader("SauceLabs.xlsx");

        String Email = td.getCellData("Login", "Email", 2);
        String Pswd = td.getCellData("Login", "Pswd", 2);

        driver.get(appUrl);
        loginPage.validateUserNameDisplayed();
        //loginPage.enterUserName("standard_user");
        loginPage.enterUserName(Email);
        loginPage.validateUserPasswordDisplayed();
        //loginPage.enterUserPassword("secret_sauce");
        loginPage.enterUserPassword(Pswd);
        loginPage.validateLoginButtonEnabled();
        loginPage.clickLoginButton();
        loginPage.validateLoginPageDisplayed();
        productsPage.validateAddToCartDisplayed();
        productsPage.clickAddToCart();
        productsPage.validateYourProductDisplayed();
        productsPage.clickOnCart();
        yourCart.validateYourCartPageDisplayed();
        yourCart.validateYourProductDisplayed();
    }
}