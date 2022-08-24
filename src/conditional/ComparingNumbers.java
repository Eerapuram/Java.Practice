package conditional;

public class ComparingNumbers {
    public static void main (String[] args){
        int a,b;
        a=55;
        b=44;
        if(a<b)
        {
            System.out.println("a is smaller than b");
        } else if (a>b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is equal to b");
        }
    }
}
