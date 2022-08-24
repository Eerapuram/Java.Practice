package polymorphism;
public class MethodOverriding {
    static void interest(int p, int t) {
        int i = (p * t * 50)/100;
        System.out.println(i);
    }

    public static void main(String args[]) {
        MethodOverriding obj = new MethodOverriding();
        obj.interest(5,8);
    }
}

