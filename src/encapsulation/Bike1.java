package encapsulation;

public class Bike1 {
    public static void main(String[] args){
        Bike obj = new Bike();
        obj.getName();
        obj.setMilage(25);
        obj.getPrice();
        obj.setName("ContinentalGT");
        System.out.println(obj.getName());
        System.out.println(obj.getmilage());
        System.out.println(obj.getPrice());
    }
}