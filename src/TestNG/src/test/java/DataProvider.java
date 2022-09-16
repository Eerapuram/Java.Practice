
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DataProvider {
    static WebDriver driver;
    //private By userEmail=By.cssSelector("input#input-email");
    //  private By password1=By.cssSelector("input#input-password");
    // private By loginButton=By.cssSelector("button[type = 'submit'][class ='btn btn-primary btn-lg hidden-xs']");
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish.Eerapuram\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
    }
    @Test(dataProvider="LoginData")
    public void loginOpenCart(String userMail,String password,String exp){
        WebElement Email= driver.findElement(By.cssSelector("input#input-email"));
        Email.clear();
        Email.sendKeys(userMail);
        WebElement pswd= driver.findElement(By.cssSelector("input#input-password"));
        pswd.clear();
        pswd.sendKeys(password);
        WebElement loginbutton=driver.findElement(By.cssSelector("button[type = 'submit'][class ='btn btn-primary btn-lg hidden-xs']"));
        loginbutton.click();
    }
    @org.testng.annotations.DataProvider(name = "LoginData")
    public String [][] getData(){

        String loginData[][]={
                { "eashishkumar2000@gmail.com","Abc@123","valid"},
                {"ravinderreddyyenna@gmail.com","8019","invalid"},
                {"ganjisruthi6@gmail.com","Sruthi@123","valid"},
                {"hemanthkumarsoma03@gmail.com","Hemu@123","valid" }

        };
        return loginData;
    }
    @AfterMethod
    public void teardown(){
        driver.close();
    }
}