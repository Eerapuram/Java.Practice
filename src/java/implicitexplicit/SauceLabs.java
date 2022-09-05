package implicitexplicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SauceLabs {
        public static void main(String args[]) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            WebDriverWait wait=new WebDriverWait(driver,20);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// doing implicity
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#user-name"))).sendKeys("standard_user");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#password"))).sendKeys("secret_sauce");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#login-button"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button#add-to-cart-sauce-labs-backpack"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button#add-to-cart-sauce-labs-bike-light"))).click();
        }
}

