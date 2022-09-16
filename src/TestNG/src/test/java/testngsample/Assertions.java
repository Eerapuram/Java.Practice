package testngsample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
    @Test
    public void display(){
        System.out.println("hello");
        Assert.assertEquals(true, true);
    }
    @Test(dependsOnMethods = "display")
    public void display1(){
        System.out.println("world");
    }
}
