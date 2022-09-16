package testngsample;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = "login")
    public void display(){
        System.out.println("Display");
    }
    @Test(groups = "display")
    public void display1(){
        System.out.println("Display1");
    }
}
