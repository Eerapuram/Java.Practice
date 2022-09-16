package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Login extends Utilities{

    private static final Logger logger = (Logger) LogManager.getLogger(Login.class);
    WebDriver driver;
    //locators
    private By userEmail = By.cssSelector("input[id='user-name']");
    private By userPassword =By.cssSelector("input[id='password']");
    private By loginButton =By.cssSelector("input[id='login-button']");
    //constructor
    public Login (WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void validateUserNameDisplayed(){
        if(visibilityOfElementWait(driver,driver.findElement(userEmail))) {
            System.out.println("User Email is Displayed Successfully");
            Reporter.log("User Email is Displayed Successfully");
            logger.error("User Email is Displayed Successfully");
        }
    }
    public void enterUserName(String email) throws Throwable {

        //driver.findElement(userEmail).sendKeys("standard_user");
        type(driver.findElement(userEmail),email);
        Reporter.log("User Name entered");
        logger.error("User Name entered");
    }
    public void validateUserPasswordDisplayed(){
        if(visibilityOfElementWait(driver,driver.findElement(userPassword))) {
            System.out.println("Password is Displayed Successfully");
            Reporter.log("Password is Displayed Successfully");
            logger.error("Password is Displayed Successfully");
        }
    }

    public void enterUserPassword(String password) throws Throwable {
        //driver.findElement(userPassword).sendKeys("secret_sauce");
        type(driver.findElement(userPassword),password);
        Reporter.log("User Name entered");
        logger.error("User Name entered");
    }
    public void validateLoginButtonEnabled(){
        if(visibilityOfElementWait(driver,driver.findElement(loginButton))) {
            System.out.println("login Button is Enabled Successfully");
            Reporter.log("login Button is Enabled Successfully");
            logger.error("login Button is Enabled Successfully");
        }
    }
    public void clickLoginButton() throws Throwable {
        //driver.findElement(loginButton).click();
        click(driver.findElement(loginButton));
        Reporter.log("Login button clicked");
        logger.error("Login button clicked");
    }

    public void validateLoginPageDisplayed(){
        String title = driver.getTitle();
        System.out.println(title);
        Reporter.log("Login page validated successfully " +title);
        logger.error("Login page validated successfully " +title);
    }


}