package hashset;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Dublicate {
    public static void main(String args[]){
        AbstractList<String> h = new ArrayList<String>();
        h.add("java");
        h.add("Selenium");
        h.add("c");
        h.add("c");
        h.add("java");
        h.add("UFT");
        System.out.println(h);
        HashSet<String> s = new HashSet<String>();
        for (String a : h){
            if(s.add(a)==false){
                System.out.println(a+ " is dublicate");
            }

        }

    }
}
