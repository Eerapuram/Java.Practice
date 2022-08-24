package arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Same {
    public static void main(String args[]){
        ArrayList<String> a = new ArrayList<String>();
        a.add("java");
        a.add("Selenium");
        a.add("c");
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("java");
        //a1.add("Selenium");
        a1.add("c");
        if(a.equals(a1))
        {
            System.out.println("both lists are same.");
        }
        else{
            System.out.println("both the lists are different.");
        }

    }
}
