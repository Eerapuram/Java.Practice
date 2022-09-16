package testngsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browsers {
    @Test
    @Parameters({"URL", "browser"})
    public void loginMethod(String URL, String browser) {
        //String url = "https://www.opencart.com/index.php?route=account/login";
        if (browser.equals("crome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(URL);
            driver.manage().window().maximize();
        } else {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get(URL);
            driver.manage().window().maximize();
        }
    }
}