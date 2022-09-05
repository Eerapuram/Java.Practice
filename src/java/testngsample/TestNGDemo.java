package testngsample;

import org.testng.annotations.*;

public class TestNGDemo {
    @Test(priority = 3)
    void first(){
        System.out.println("First Test");
    }
    @Test(priority = 1)
    void second(){
        System.out.println("Second Test");
    }
    @Test
    void third(){
        System.out.println("Third Test");
    }
    @Test(priority = 2)
    void fourth(){
        System.out.println("Fourth Test");
    }
    @Test
    void fifth(){
        System.out.println("Fifth Test");
    }
    @BeforeTest
    void befTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    void afTest(){
        System.out.println("After Test");
    }
    @BeforeSuite
    void befSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    void afSuite(){
        System.out.println("After Suite");
    }
    @BeforeClass
    void befClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    void afClass(){
        System.out.println("After Class");
    }
    @BeforeMethod
    void befMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    void afMethod(){
        System.out.println("After Method");
    }
}
