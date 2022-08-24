package encapsulation;

public class Car1 {
    public static void main(String[] args){
        Car obj = new Car();
        obj.getName();
        obj.getmilage();
        obj.getPrice();
        obj.setPrice(4500000);
        System.out.println(obj.getName());
        System.out.println(obj.getmilage());
        System.out.println(obj.getPrice());
    }
}
