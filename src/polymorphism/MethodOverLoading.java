package polymorphism;

public class MethodOverLoading {
    static void multiplication(int a, int b){
        int x = a*b;
        System.out.println(x);
    }
    static void multiplication(int a,int b,int c){
        int x = a*b*c;
        System.out.println(x);
    }
    static void multiplication(double a,double b){
        double x = a*b;
        System.out.println(x);
    }
    static void multiplication(float a,float b){
        float x = a*b;
        System.out.println(x);
    }

    public static void main(String args[]){
        MethodOverLoading obj = new MethodOverLoading();
        obj.multiplication(5,2);
        obj.multiplication(5,6,7);
        obj.multiplication(2.5,5.5);
        obj.multiplication(12.5f,9.5f);
    }

}