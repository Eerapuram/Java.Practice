package strings;

public class SplitString2
{
    public static void main(String args[])
    {
        String str = "Test01$$forAutomation03!@";
        StringBuffer a = new StringBuffer(),
                num = new StringBuffer(),
                special = new StringBuffer();

        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                a.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }

        System.out.println(a);
        System.out.println(num);
        System.out.println(special);
    }
}
