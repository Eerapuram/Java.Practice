package polymorphism;
public class MethodOverriding1 extends MethodOverriding {
    static void interest(int p,int t) {

        float i = (p * t * 30)/100;
        System.out.println(i);
    }
    public static void main(String args[]) {
        MethodOverriding1 obj = new MethodOverriding1();
        obj.interest(13,6);
    }
}