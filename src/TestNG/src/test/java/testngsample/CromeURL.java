package testngsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CromeURL {
    @Test
    @Parameters({"url"})
    public void loginMethod() {
        String url = "https://www.opencart.com/index.php?route=account/login";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
