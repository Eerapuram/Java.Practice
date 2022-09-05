package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("#confirmButton")).click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().dismiss();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[id='timerAlertButton']")).click();
        driver.switchTo().alert().accept();
        /*WebElement e = driver.findElement(By.id("promptButton"));
        e.click();
        String text1 = driver.switchTo().alert().getText();
        System.out.println(text1);
        driver.switchTo().alert().sendKeys("Ashish");
        driver.switchTo().alert().accept();*/
    }
}
