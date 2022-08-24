package classobject;

public class Pen {
    String name = "Pilot" ,color = "Blue" ;
    int price=45;
    public void printDetails(){
        System.out.println("Name : " +name);
        System.out.println("Color : " +color);
        System.out.println("Price : " +price);
    }
    public static void main(String[] args){
        Pen p = new Pen();
        p.printDetails();
    }
}