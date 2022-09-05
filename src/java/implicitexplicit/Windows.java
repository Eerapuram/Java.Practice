package implicitexplicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String mainwindow = driver.getWindowHandle();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[id='windowButton']"))).click();
        Thread.sleep(3000);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows.size());
        Iterator<String> it = windows.iterator();
        while (it.hasNext()){
            String childWindow = it.next();
            if(!mainwindow.equalsIgnoreCase(childWindow))
            {
                driver.switchTo().window(childWindow);
                WebElement e = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@id='sampleHeading']")));
                System.out.println(e.getText());
                System.out.println(driver.getCurrentUrl());
            }
        }
        driver.switchTo().window(mainwindow);
    }
}
