package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class YourCart extends Utilities {

    private static final Logger logger = (Logger) LogManager.getLogger(YourCart.class);
    WebDriver driver;
    //locators
    private By cart2 = By.cssSelector("#item_4_title_link");
    private By menubutton = By.cssSelector("#react-burger-menu-btn");
    private By logoutBtn =By.cssSelector("a[id='logout_sidebar_link']");
    //constructor
    public YourCart (WebDriver driver){
        this.driver = driver;
    }

    public void validateYourCartPageDisplayed(){
        String title = driver.getTitle();
        System.out.println(title);
        Reporter.log("Your Cart Page is Displayed " +title);
        logger.error("Your Cart Page is Displayed " +title);
    }

    public void  validateYourProductDisplayed() {
        String message = driver.findElement(cart2).getText();
        System.out.println("cart item "+message+" is added successfully");
        Reporter.log("cart item "+message+" is added successfully");
        logger.error("cart item "+message+" is added successfully");
    }
    public void  validateMenuBtnDisplayed(){
        if(visibilityOfElementWait(driver,driver.findElement(menubutton)))
            System.out.println("menu button is enabled Successful");
            Reporter.log("menu button is enabled Successful");
            logger.error("menu button is enabled Successful");
    }
    public  void clickMenuBth() throws Throwable {
        //driver.findElement(menubutton).click();
        click(driver.findElement(menubutton));
        Reporter.log("Menu Button is clicked");
        logger.error("Menu Button is clicked");
    }

    public void validateLogoutBtnDisplayed(){
        if (visibilityOfElementWait(driver,driver.findElement(logoutBtn)))
            System.out.println("logout Button is enabled");
            Reporter.log("logout Button is enabled");
            logger.error("logout Button is enabled");
    }
    public void clickLogoutBtn() throws Throwable {
        //driver.findElement(logoutBtn).click();
        click(driver.findElement(logoutBtn));
        Reporter.log("clicked on logout button");
        logger.error("clicked on logout button");
    }

}
