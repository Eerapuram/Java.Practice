package samplechromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleEdgeDriver {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver","C:\\Users\\Ashish.Eerapuram\\Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login");
    }
}
