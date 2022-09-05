package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOpencart {
        public static void main(String[] args){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.opencart.com/index.php?route=account/login%22");
            driver.findElement(By.xpath("(//a[@href='https://www.opencart.com/index.php?route=account/login'])[3]")).click();
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("eashishkumar2000@gmail.com");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc@123");
            driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
            driver.findElement(By.xpath("//a[@class='btn btn-link navbar-btn']")).click();
            driver.findElement(By.xpath("//input[@name='pin']")).sendKeys("8055");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.findElement(By.xpath("//img[@src='application/view/image/account/icons/account_details.svg']")).click();
            driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kumar");
            driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ashish");
            driver.findElement(By.xpath("//input[@name='company']")).sendKeys("ZenQ");
            driver.findElement(By.xpath("//input[@name='tax_id']")).sendKeys("123456");
            //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("eashishkumar2000@gmail.com");
            driver.findElement(By.xpath("//select[@id='input-country']")).sendKeys("India");
            driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        }
}
