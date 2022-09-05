package implicitexplicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Alerts {public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/alerts");
    driver.manage().window().maximize();
    WebDriverWait wait=new WebDriverWait(driver,20);
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    //Thread.sleep(3000);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='alertButton']"))).click();
    driver.switchTo().alert().accept();
    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#confirmButton"))).click();
    String text = driver.switchTo().alert().getText();
    System.out.println(text);
    driver.switchTo().alert().dismiss();
    Thread.sleep(5000);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[id='timerAlertButton']"))).click();
    driver.switchTo().alert().accept();
        /*WebElement e = driver.findElement(By.id("promptButton"));
        e.click();
        String text1 = driver.switchTo().alert().getText();
        System.out.println(text1);
        driver.switchTo().alert().sendKeys("Ashish");
        driver.switchTo().alert().accept();*/
}
}
