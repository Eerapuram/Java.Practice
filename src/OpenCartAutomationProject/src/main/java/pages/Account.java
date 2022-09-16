package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Account extends Utilities {

    private static final Logger logger = (Logger) LogManager.getLogger(Account.class);
    WebDriver driver;
    private By accountDetails = By.xpath("//a[text()='Account Details']");

    //constructor
    public Account(WebDriver driver) {
        this.driver = driver;
    }


    public void ValidateAccountDetailsLinkEnabled() {
        if (visibilityOfElementWait(driver,driver.findElement(accountDetails)))
            System.out.println("Account Details Link is Enabled");
            Reporter.log("Account Details Link is Enabled");
            logger.error("Account Details Link is Enabled");
    }

    public void clickAccountDetails() throws Throwable {
        //driver.findElement(accountDetails).click();
        click(driver.findElement(accountDetails));
        Reporter.log("Account Details Link is clicked");
        logger.error("Account Details Link is clicked");
    }

    public void ValidateAccountDetailsPageDisplayed() {
        String title = driver.getTitle();
        System.out.println("Title of Account Details Page " + title);
        Reporter.log("Title of Account Details Page " + title);
        logger.error("Title of Account Details Page " + title);
    }
}