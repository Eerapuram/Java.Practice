package varificationstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Opencart {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
        if( driver.findElement(By.cssSelector("input#input-email")).isDisplayed()){
            System.out.println("The email text field is displayed");
            driver.findElement(By.cssSelector("input#input-email")).sendKeys("eashishkumar2000@gmail.com");
        }
        if(driver.findElement(By.cssSelector("input#input-password")).isDisplayed()){
            System.out.println("The password  text field is displayed");
            driver.findElement(By.cssSelector("input#input-password")).sendKeys("Abc@123");
        }
        if(driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg hidden-xs']")).isEnabled()){
            System.out.println("The login button is enabled");
            driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg hidden-xs']")).click();
        }
        if(driver.findElement(By.cssSelector("input#input-pin")).isDisplayed()){
            System.out.println("The pin change field is displayed");
            driver.findElement(By.cssSelector("input#input-pin")).sendKeys("8055");
        }
        if(driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg']")).isEnabled()){
            System.out.println("The continue button is enabled");
            driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg']")).click();
        }
        if(driver.findElement(By.xpath("(//div[@class='col-md-6'])[1]")).isEnabled()) {
            System.out.println("Account details is Enabled");
            driver.findElement(By.xpath("(//div[@class='col-md-6'])[1]")).click();
            System.out.println("Account details is displayed");
        }
        driver.findElement(By.cssSelector("input#input-username")).clear();
        if(driver.findElement(By.cssSelector("input#input-username")).isDisplayed()) {
            System.out.println("it shows the username field");
            driver.findElement(By.cssSelector("input#input-username")).sendKeys("Kumar.ashish");
        }
        driver.findElement(By.cssSelector("input#input-firstname")).clear();
        if(driver.findElement(By.cssSelector("input#input-firstname")).isDisplayed()) {
            System.out.println("enter the first name");
            driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("ashish");
        }
        driver.findElement(By.cssSelector("input#input-lastname")).clear();
        if(driver.findElement(By.cssSelector("input#input-lastname")).isDisplayed()) {
            System.out.println("it show the last name field enter the last name");
            driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("kumar");
        }
        driver.findElement(By.cssSelector("input#input-company")).clear();
        if(driver.findElement(By.cssSelector("input#input-company")).isDisplayed()){
            System.out.println("The company field is displayed");
            driver.findElement(By.cssSelector("input#input-company")).sendKeys("zenq");
        }
        driver.findElement(By.cssSelector("input#input-tax-id")).clear();
        if (driver.findElement(By.cssSelector("input#input-tax-id")).isDisplayed()) {
            System.out.println("The tax id field is opened");
            driver.findElement(By.cssSelector("input#input-tax-id")).sendKeys("123456");
        }
        if(driver.findElement(By.cssSelector("select#input-country")).isEnabled()){
            System.out.println("The country names list is enabled");
            driver.findElement(By.cssSelector("select#input-country")).sendKeys("India");
        }
        //    driver.findElement(By.cssSelector("button[type='button'][class='btn btn-success btn-block']")).click();
        if(driver.findElement(By.cssSelector("input[type='radio'][value='0']")).isEnabled()) {
            System.out.println("The notify references options yes or no is enabled");
            driver.findElement(By.cssSelector("input[type='radio'][value='0']")).click();
        }
        if(driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary']")).isEnabled()) {
            System.out.println("The submit button is enabled");
            driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary']")).click();
        }

    }
}