package encapsulation;

public class Pen1 {
    public static void main(String[] args){
        Pen obj = new Pen();
        obj.getName();
        obj.getPrice();
        obj.setName("Trimax");
        System.out.println(obj.getName());
        System.out.println(obj.getPrice());
    }
}