package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.util.List;

public class EditAccountDetails extends Utilities {

    private static final Logger logger = (Logger) LogManager.getLogger(EditAccountDetails.class);
    WebDriver driver;
    private By userName = By.cssSelector(" #input-username");
    private By firstName = By.cssSelector("#input-firstname");
    private By lastName = By.cssSelector("#input-lastname");
    private By companyName = By.cssSelector("#input-company");
    private By tax = By.cssSelector("#input-tax-id");
    private By userEmail = By.cssSelector("#input-email");
    private By country = By.cssSelector("select#input-country");
    private By radioButton = By.cssSelector("input[type='radio'][value = '1']");
    private By submitButton = By.cssSelector("button[type='submit'][class='btn btn-primary']");
    private By submitMessage = By.xpath("//div[@class='alert alert-success']");
    private By logout = By.cssSelector("a[class = 'btn btn-black navbar-btn']");

    //constructor
    public EditAccountDetails(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void validateEditAccountdetailsDisplayed() {
        String title = driver.getTitle();
        System.out.println("Title of Edit account details page is" + title);
        Reporter.log("Title of Edit account details page is " + title);
    }

    public void validateUserNameDisplayed() {
        if (visibilityOfElementWait(driver,driver.findElement(userName))) ;
        System.out.println("user name is displayed successfully");
        Reporter.log("user name is displayed successfully");
    }

    public void enterUserName(String username) throws Throwable {
     /*  if(userName.equals("eashishkumar2000@gmail.com")) {
           System.out.println("yes username is eashishkumar2000@gmail.com");
       }
           else {
               driver.findElement(userName).sendKeys("eashishkumar2000@gmail.com");
           }*/
        driver.findElement(userName).clear();
        //driver.findElement(userName).sendKeys("rgfng");
        type(driver.findElement(userName),username);
        Reporter.log("UserName cleared");

    }

    public void validateFirstNameDisplayed() {
        if (visibilityOfElementWait(driver,driver.findElement(firstName))) ;
        System.out.println("first name is displayed successfully");
        Reporter.log("first name is displayed successfully");
        logger.error("first name is displayed successfully");
    }

    public void enterFirstName(String firstname) throws Throwable {
        driver.findElement(firstName).clear();
        //driver.findElement(firstName).sendKeys("yui");
        type(driver.findElement(firstName),firstname);
        Reporter.log("First Name is cleared");
    }

    public void validateLastNameDisplayed() {
        if (visibilityOfElementWait(driver,driver.findElement(lastName))) ;
        System.out.println("last name is displayed successfully");
        Reporter.log("last name is displayed successfully");
    }

    public void enterLastName(String Lastname) throws Throwable {
        driver.findElement(lastName).clear();
        //driver.findElement(lastName).sendKeys("chi");
        type(driver.findElement(lastName),Lastname);
        Reporter.log("Last Name is cleared");
    }

    public void validateCompanyNameDisplayed() {
        if (visibilityOfElementWait(driver,driver.findElement(companyName))) ;
        System.out.println("company name is displayed successfully");
        Reporter.log("company name is displayed successfully");
    }

    public void enterCompanyName(String companyname) throws Throwable {
        driver.findElement(companyName).clear();
        //driver.findElement(companyName).sendKeys("Qualitest");
        type(driver.findElement(companyName),companyname);
        Reporter.log("company name cleared");
    }

    public void validateTaxNameDisplayed() {
        if (visibilityOfElementWait(driver,driver.findElement(companyName))) ;
        System.out.println("company name is displayed successfully");
        Reporter.log("company name is displayed successfully");
    }

    public void enterTax(String taxid) throws Throwable {
        driver.findElement(tax).clear();
        //driver.findElement(tax).sendKeys("999");
        type(driver.findElement(tax),taxid);
        Reporter.log("Tax ID cleared");
    }

    public void validateUserEmail1Displayed() {
        if (visibilityOfElementWait(driver,driver.findElement(userEmail))) ;
        System.out.println("user Email name is displayed successfully");
        Reporter.log("user Email name is displayed successfully");
    }

    public void enterUserEmail(String email) throws Throwable {
        driver.findElement(userEmail).clear();
        //driver.findElement(userEmail).sendKeys("eashishkumar2000@gmail.com");
        type(driver.findElement(userEmail), email);
        Reporter.log("email is cleared");
    }

    public void validateCountryEnabled() {
        if (visibilityOfElementWait(driver,driver.findElement(country))) ;
        System.out.println("country is Enabled successfully");
        Reporter.log("country is Enabled successfully");
    }

    public void selectCountry() {
        /*WebElement ele = driver.findElement(country);
        Select a = new Select(ele);
        //a.selectByVisibleText("India");
        List<WebElement> list = a.getOptions();
        System.out.println(list.size());
        for (WebElement option : list) {
            String actualtext = option.getText();
            if (actualtext == "Germany") ;
            {
                a.selectByVisibleText("Germany");
                break;
            }

        }*/
        SelectDropDown(driver.findElement(country),"Germany","visibletext");
        Reporter.log("country is displayed successfully");

    }

    public void validateRadioButtonDisplayed() {
        if (visibilityOfElementWait(driver,driver.findElement(radioButton))) ;
        System.out.println("radio button is Enabled successfully");
        Reporter.log("radio button is Enabled successfully");
    }

    public void selectRadioButton() throws Throwable {

        //driver.findElement(radioButton).click();
        click(driver.findElement(radioButton));
        Reporter.log("Radio Button is clicked");
    }

    public void validateSubmitButtonDisplayed() {
        if (visibilityOfElementWait(driver,driver.findElement(submitButton))) ;
        System.out.println("submit Button is Enabled successfully");
        Reporter.log("submit Button is Enabled successfully");
    }

    public void clickSubmitButton() throws Throwable {
        //driver.findElement(submitButton).click();
        click(driver.findElement(submitButton));
        Reporter.log("Submit button is clicked");
    }

    public void ValidateEditAccountDetailsSuccesful() {
        String message = driver.findElement(submitMessage).getText();
        System.out.println(message);
        Reporter.log("Account Details validated sucessfully");

    }

    public void clickLogoutEnanbled() {
        if (visibilityOfElementWait(driver,driver.findElement(logout))) ;
        System.out.println("Logout  successful");
        Reporter.log("Logout  successful");
    }

    public void clickLogoutButton() throws Throwable {
        //driver.findElement(logout).click();
        click(driver.findElement(logout));
        Reporter.log("Log Out button clicked");

    }
}
