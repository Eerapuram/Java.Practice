package testngsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class EdgeURL {
    @Test
    @Parameters({"url"})
    public void loginMethod1(String url) {
        //String url="https://www.opencart.com/index.php?route=account/login";
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
