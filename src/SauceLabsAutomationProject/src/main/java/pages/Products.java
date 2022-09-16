package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Products extends Utilities{

    private static final Logger logger = (Logger) LogManager.getLogger(Products.class);
    WebDriver driver;
    //locators
    private By addToCart = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    private By cart = By.cssSelector("a[class='shopping_cart_link']");
    public Products (WebDriver driver){
        this.driver = driver;
    }
    public void validateAddToCartDisplayed(){
        if(visibilityOfElementWait(driver,driver.findElement(addToCart))) {
            System.out.println("add to cart is Enabled Successfully");
            Reporter.log("add to cart is Enabled Successfully");
            logger.error("add to cart is Enabled Successfully");
        }
    }
    public void clickAddToCart() throws Throwable {

        //driver.findElement(addToCart).click();
        click(driver.findElement(addToCart));
        Reporter.log("add to cart button clicked");
        logger.error("add to cart button clicked");
    }

    public void  validateYourProductDisplayed(){
        if(visibilityOfElementWait(driver,driver.findElement(cart)))
            System.out.println("Cart LinK is Enabled Successful");
            Reporter.log("Cart LinK is Enabled Successful");
            logger.error("Cart LinK is Enabled Successful");
    }
    public void clickOnCart() throws Throwable {
        //driver.findElement(cart).click();
        click(driver.findElement(cart));
        Reporter.log("clicked on cart");
        logger.error("clicked on cart");
    }
}