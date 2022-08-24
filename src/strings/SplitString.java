package strings;

public class SplitString
{
    public static void main(String args[])
    {
        String s = new String("Java is a programming language");
        String[] arrOfs = s.split(" ");
        for(String i : arrOfs)
        {
            System.out.println(i);
        }
    }
}
