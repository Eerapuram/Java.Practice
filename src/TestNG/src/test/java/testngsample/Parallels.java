package testngsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallels {

    @Test
    public void launchOpencart(){
        System.out.println("The thread id for OpenCart is: "+Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login%22");
        driver.manage().window().maximize();
    }

    @Test
    public void launchSauceLabs(){
        System.out.println("The thread id for SauceLabs is: "+Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
}
