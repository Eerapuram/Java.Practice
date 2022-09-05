package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpencartRegister {
        public static void main(String[] args){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.opencart.com/index.php?route=account/login%22");
            driver.findElement(By.xpath("(//a[@href='https://www.opencart.com/index.php?route=account/register'])[3]")).click();
            driver.findElement(By.xpath("//input[@name='firstname']//preceding::input[1]")).sendKeys("Kumar.ashish");
            driver.findElement(By.xpath("//input[@name='lastname']//preceding::input[1]")).sendKeys("Ashish");
            driver.findElement(By.xpath("//input[@id='input-email']//preceding::input[1]")).sendKeys("kumar");
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("eashishkumar2000@gmail.com");
            driver.findElement(By.xpath("//select[@id='input-country']")).sendKeys("India");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc@123");
        }
    }

