package abstraction;

public class Car1 extends Car {
    void getName(){
        System.out.println("TOYOTA");
    }
    void getMilage(){
        System.out.println(18);
    }
    public static void main(String[] args){
        Car1 c = new Car1();
        c.getName();
        c.getMilage();
    }


}
