package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login%22");
        driver.findElement(By.cssSelector("#input-email")).sendKeys("eashishkumar2000@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("Abc@123");
        //driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg hidden-xs']")).click();
        if(driver.findElement(By.cssSelector("button[type = 'submit'][class ='btn btn-primary btn-lg hidden-xs']")).isEnabled())
        {
            System.out.println("login button is Enabled ");
            driver.findElement(By.cssSelector("button[type = 'submit'][class ='btn btn-primary btn-lg hidden-xs']")).click();
        }
        driver.findElement(By.cssSelector("input[name='pin']")).sendKeys("8055");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("img[src='application/view/image/account/icons/account_details.svg']")).click();
        driver.findElement(By.cssSelector("input#input-firstname")).clear();
        driver.findElement(By.cssSelector("input[id$='firstname']")).sendKeys("abc");
        driver.findElement(By.cssSelector("input#input-lastname")).clear();
        driver.findElement(By.cssSelector("input[name^='lastname']")).sendKeys("xyz");
        driver.findElement(By.cssSelector("input#input-company")).clear();
        driver.findElement(By.cssSelector("input[name='company']")).sendKeys("ZenQ");
        driver.findElement(By.cssSelector("input#input-tax-id")).clear();
        driver.findElement(By.cssSelector("input[name='tax_id']")).sendKeys("123456");
        driver.findElement(By.cssSelector("select[id='input-country']")).sendKeys("India");
        WebElement E1= driver.findElement(By.cssSelector("select[name='country_id'][id='input-country']"));
        Select select=new Select(E1);
        select .selectByIndex(5); // andorra
        Thread.sleep(4000);
        if (driver.findElement(By.cssSelector("input[type='radio'][value='1']")).isDisplayed())
        {
            System.out.println("it display the notify extension updates YES");
            driver.findElement(By.cssSelector("input[type='radio'][value='1']")).click();
        }
        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
    }
}