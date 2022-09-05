package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login%22");
        driver.findElement(By.cssSelector("#input-email")).sendKeys("eashishkumar2000@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("Abc@123");
        driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg hidden-xs']")).click();
        driver.findElement(By.cssSelector("input[name='pin']")).sendKeys("8055");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for(WebElement link:allLinks)
        {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
        driver.quit();
    }
}
