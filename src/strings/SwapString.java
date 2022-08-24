package strings;

public class SwapString {
    public static void main(String args[]){
        String temp;
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("\nBefore Swapping\n");
        System.out.println("s1: \t"+s1);
        System.out.println("s2: \t"+s2);
        temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("\nAfter Swapping\n");
        System.out.println("s1: \t"+s1);
        System.out.println("s2: \t"+s2);

    }
}
