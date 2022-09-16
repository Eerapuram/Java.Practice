package testngsample;

import org.testng.annotations.Test;
public class Invocation {
    @Test(invocationCount = 5,priority = 1)
    void display() {
        System.out.println("this is innovacation method");
    }

    @Test(invocationCount = 4,priority = 3)
    //  @Test(priority = 2)
    public void add() {
        int a = 7;
        int b = 8;
        int c = a + b;
        System.out.println(c);
    }

    @Test(invocationTimeOut = 0,priority = 2)
    private void mul() {
        int a = 4;
        int b = 8;
        int c = a * b;
        System.out.println(c);
    }
}