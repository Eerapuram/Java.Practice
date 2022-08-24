package abstraction;

public class Pen1 {
    void getName(){
        System.out.println("Parker");
    }
    void getColor(){
        System.out.println("Blue");
    }
    void getCost(){
        System.out.println(150);
    }

    public static void main(String[] args){
        Pen1 p = new Pen1();
        p.getName();
        p.getColor();
        p.getCost();
    }
}
