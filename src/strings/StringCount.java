package strings;

public class StringCount {
    public static void main(String args[]){
        int i, count = 0;
        char c = 't';
        String s = new String("testingtest");
        for(i=0; i<s.length();i++){
            if(s.charAt(i)==c)
            {
                count++;
            }
        }
        System.out.println(c+" = "+count);
    }
}
