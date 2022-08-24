package arraylist;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String args[]){
        ArrayList<String> a = new ArrayList<String>();
        a.add("pen");
        a.add("pencil");
        a.add("book");
        a.add("geomentry");
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("pen");
        a1.add("pencil");
        a1.add("sketch");
        a1.add("paper");
        System.out.println("The first elements are:\n" +a+"\n");
        System.out.println("The second elements are:\n" +a1+"\n");
        a.retainAll(a1);
        System.out.println("The common elements in both the lists are:\n" +a);

    }
}
