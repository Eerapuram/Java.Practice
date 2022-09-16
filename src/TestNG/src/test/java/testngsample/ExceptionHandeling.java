package testngsample;

import org.testng.annotations.Test;

public class ExceptionHandeling {
    @Test(expectedExceptions = NumberFormatException.class)
    public void handelException(){
        String str = "1001";
        System.out.println(Integer.parseInt(str));
        String str1 = "10A01";
        System.out.println(Integer.parseInt(str1));
    }
}
