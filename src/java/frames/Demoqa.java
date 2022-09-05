package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        int framesCount = driver.findElements(By.tagName("iframe")).size();
        System.out.println(framesCount);
        driver.switchTo().frame("frame2");
        WebElement e = driver.findElement(By.id("sampleHeading"));
        System.out.println(e.getText());
        driver.switchTo().parentFrame();
    }
}