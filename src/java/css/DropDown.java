package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login%22");
        driver.findElement(By.cssSelector("#input-email")).sendKeys("eashishkumar2000@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("Abc@123");
        driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg hidden-xs']")).click();
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
        //driver.findElement(By.cssSelector("select[id='input-country']")).sendKeys("India");
        WebElement E1= driver.findElement(By.cssSelector("select[name='country_id'][id='input-country']"));
        Select select=new Select(E1);
        //  select .selectByIndex(8); // antrantica
        // select.selectByVisibleText("India");
        //select.selectByValue(String.valueOf(22)); // brazil
        //List<WebElement> list=driver.findElements(By.tagName("option"));
        List<WebElement> list=select.getOptions();
        //  System.out.println(list.size());
        for(WebElement op:list){
            String actualtext=op.getText();
            System.out.println(actualtext);
            if(actualtext=="Brazil");{
                select.selectByVisibleText("Brazil");
                break;
            }
        }
        //driver.findElement(By.cssSelector("button[type='button'][class='btn btn-success btn-block']")).click();
        //driver.findElement(By.cssSelector("input[type='radio'][value='0']")).click();
        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
    }
}