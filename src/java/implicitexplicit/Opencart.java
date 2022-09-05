package implicitexplicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Opencart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login%22");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#input-email"))).sendKeys("eashishkumar2000@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#input-password"))).sendKeys("Abc@123");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg hidden-xs']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='pin']"))).sendKeys("8055");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[type='submit']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[src='application/view/image/account/icons/account_details.svg']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#input-firstname"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id$='firstname']"))).sendKeys("abc");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#input-lastname"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name^='lastname']"))).sendKeys("xyz");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#input-company"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='company']"))).sendKeys("ZenQ");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#input-tax-id"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='tax_id']"))).sendKeys("123456");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select[id='input-country']"))).sendKeys("India");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[class='btn btn-primary']"))).click();
    }
}
