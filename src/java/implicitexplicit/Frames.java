package implicitexplicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int framecount = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("iframe"))).size();
        System.out.println(framecount);
        driver.switchTo().frame("frame2");
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sampleHeading")));
        System.out.println(e.getText());
        driver.switchTo().parentFrame();
    }
}
