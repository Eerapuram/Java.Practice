package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathFollowing {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.saucedemo.com/");
        //driver.findElement(By.xpath("//input[@name='user-name']//following :: input[1]")).sendKeys("secret_sauce");
        //driver.findElement(By.xpath("//input[@name='password']//preceding::input")).sendKeys("secret_sauce");
        //driver.findElement(By.xpath("//child::div"));
    }
}
