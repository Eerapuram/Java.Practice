package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Login extends Utilities {

    private static final Logger logger = (Logger) LogManager.getLogger(Login.class);
    WebDriver driver;
    //locators
    private By userEmail = By.cssSelector("#input-email");
    private By userPassword =By.cssSelector("#input-password");
    private By loginButton =By.cssSelector("button[type='submit']");
    private By tokenPin= By.cssSelector("#input-pin");
    private By continueButton = By.cssSelector("button[type = 'submit']");
    //constructor
    public Login (WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void validateUserEmailDisplayed(){
        if(visibilityOfElementWait(driver,driver.findElement(userEmail))) {
            System.out.println("User Email is Displayed Successfully");
            Reporter.log("User Email is Displayed Successfully");
            logger.error("This validates the User Email display");
        }
    }
    public void enterUserEmail(String emailaddress) throws Throwable {

        //driver.findElement(userEmail).sendKeys("eashishkumar2000@gmail.com");
        type(driver.findElement(userEmail),emailaddress);
        Reporter.log("Username entered successfully");
        logger.info("Username entered successfully");
    }
    public void validateUserPasswordDisplayed(){
        if(visibilityOfElementWait(driver,driver.findElement(userPassword))) {
            System.out.println("Password is Displayed Successfully");
            Reporter.log("Password is Displayed Successfully");
        }
    }

    public void enterUserPassword(String Password) throws Throwable {

        //driver.findElement(userPassword).sendKeys("Abc@123");
        type(driver.findElement(userPassword),Password);
        Reporter.log("Password enetered successfully");
    }
    public void validateLoginButtonEnabled(){
        if(visibilityOfElementWait(driver,driver.findElement(loginButton))) {
            System.out.println("login Button is Enabled Successfully");
            Reporter.log("Login button enabled");
        }
    }
    public void clickLoginButton() throws Throwable {

        //driver.findElement(loginButton).click();
        click(driver.findElement(loginButton));
        Reporter.log("Login button clicked");
    }
    public void validatePinDisplay(){
        if( visibilityOfElementWait(driver,driver.findElement(tokenPin))) {
            System.out.println("Pin confrim is displayed successfully");
            Reporter.log("Pin confrim is displayed successfully");
        }
    }
    public void enterTokenPin(String pin) throws Throwable {

        //driver.findElement(tokenPin).sendKeys("8055");
        type(driver.findElement(tokenPin),pin);
        Reporter.log("Token Pin entered");
    }
    public void validateContinueButtonEnabled(){
        if( visibilityOfElementWait(driver,driver.findElement(continueButton))) {
            System.out.println("Continue Button is Enabled successfully");
            Reporter.log("Continue Button is Enabled successfully");
        }
    }
    public void clickContinueButton() throws Throwable {

        //driver.findElement(continueButton).click();
        click(driver.findElement(continueButton));
        Reporter.log("Continue button clicked");
    }

    public void validateLoginPageDisplayed(){
        String title = driver.getTitle();
        System.out.println(title);
        Reporter.log("Title of Login Page " + title);
    }


}