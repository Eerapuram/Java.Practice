package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Demoqa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        String mainwindow = driver.getWindowHandle();
        driver.findElement(By.cssSelector("button[id='windowButton']")).click();
        Thread.sleep(3000);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows.size());
        Iterator<String> it = windows.iterator();
        while (it.hasNext()){
            String childWindow = it.next();
            if(!mainwindow.equalsIgnoreCase(childWindow))
            {
                driver.switchTo().window(childWindow);
                WebElement e = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                System.out.println(e.getText());
                System.out.println(driver.getCurrentUrl());
            }
        }
        driver.switchTo().window(mainwindow);
    }
}