package strings;

public class StringReplace {
    public static void main(String args[]){
        String s = "Test@Testing should be replaced as Test Testing";
        String replaceString = s.replace('@',' ');
        System.out.println(replaceString);
    }
}
