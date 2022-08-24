package strings;

public class DisplayDigits
{
    public static void main(String args[]){
        String s = new String("Test1234");
        String s1 = s.replaceAll("[^0-9]", " ");
        System.out.println(s1);
    }
}
