package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        boolean isSelbeforce = driver.findElement(By.cssSelector("span.rct-checkbox")).isSelected();
        System.out.println("isSelbefore");
        boolean isDis = driver.findElement(By.cssSelector("span.rct-checkbox")).isDisplayed();
        System.out.println("isDis");
        boolean isChk = driver.findElement(By.cssSelector("span.rct-checkbox")).isEnabled();
        System.out.println("isChk");
        driver.findElement(By.cssSelector("span.rct-checkbox")).click();
    }
}