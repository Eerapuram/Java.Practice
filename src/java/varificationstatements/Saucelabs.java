package varificationstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucelabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        if( driver.findElement(By.cssSelector("input[id='user-name']")).isDisplayed()){
            System.out.println("The email text field is displayed");
            driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
        }
        if(driver.findElement(By.cssSelector("input[id='password']")).isDisplayed()){
            System.out.println("The password  text field is displayed");
            driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
        }
        if(driver.findElement(By.cssSelector("input[id='login-button']")).isEnabled()){
            System.out.println("The login button is enabled");
            driver.findElement(By.cssSelector("input[id='login-button']")).click();
        }
        if(driver.findElement(By.cssSelector("button[id='add-to-cart-sauce-labs-backpack']")).isEnabled()){
            System.out.println("The login button is enabled");
            driver.findElement(By.cssSelector("button[id='add-to-cart-sauce-labs-backpack']")).click();
        }
    }
}
