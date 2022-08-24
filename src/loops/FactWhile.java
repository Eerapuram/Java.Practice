package loops;

public class FactWhile {
    public static void main(String args[]) {
        int i=1;
        int n = 4;
        int fact=1;
        while (i <= 4) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
