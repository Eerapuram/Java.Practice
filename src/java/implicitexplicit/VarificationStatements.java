package implicitexplicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VarificationStatements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if( wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='user-name']"))).isDisplayed()){
            System.out.println("The email text field is displayed");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='user-name']"))).sendKeys("standard_user");
        }
        if(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='password']"))).isDisplayed()){
            System.out.println("The password  text field is displayed");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='password']"))).sendKeys("secret_sauce");
        }
        if(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='login-button']"))).isEnabled()){
            System.out.println("The login button is enabled");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='login-button']"))).click();
        }
        if(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[id='add-to-cart-sauce-labs-backpack']"))).isEnabled()){
            System.out.println("The login button is enabled");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[id='add-to-cart-sauce-labs-backpack']"))).click();
        }
    }
}
