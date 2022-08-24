package strings;

public class Vowels {
    public static void main(String args[]) {
        String s = "ssaeigiouk";
        String s1 = s.replaceAll("[^aeiou]", " ");
        System.out.println(s1);
    }
}
