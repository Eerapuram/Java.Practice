package inheritance;

public class Pen {
    String name = "Cello";
    String ink = "Blue";
    int price = 10;

    void displayPenInfo(){
        System.out.println(name);
        System.out.println(ink);
        System.out.println(price);
    }
    public static void main(String[] args){
        Pen obj = new Pen();
        obj.displayPenInfo();
    }
}
