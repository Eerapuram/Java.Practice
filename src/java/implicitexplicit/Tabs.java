package implicitexplicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Tabs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("The link is working correct and it as opened");
        driver .manage().window().maximize();
        String mainwindow= driver.getWindowHandle();  //stored in mainwindow //getting window handled permission
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a#simpleLink"))).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='dynamicLink']"))).click();
        //Thread.sleep(3000);
        ArrayList<String> tabs1=new ArrayList<>(driver.getWindowHandles());
        int tabsize=tabs1.size();//gettind count of tabs opened
        System.out.println("finding the how many  tabs are opened:" +tabsize);
        for(int i=1;i<tabsize;i++){
            driver.switchTo().window(tabs1.get(i));
            System.out.println(driver.getTitle()); //it get title of that page
            System.out.println(driver.getCurrentUrl()); // it get the correct page of the url
            System.out.println(driver.getPageSource()); // it get from where the page and code
            //Thread.sleep( 1000);
        }
        driver.switchTo().window(mainwindow); // it takes or direct to mainwindow
    }
}
