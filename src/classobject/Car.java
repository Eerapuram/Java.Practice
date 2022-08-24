package classobject;

public class Car {
    String name = "BMW" ,color = "Black" ,model = "Series 8";
    int price=12000000,year=2020;
    public void printDetails(){
        System.out.println("Name : " +name);
        System.out.println("Color : " +color);
        System.out.println("Model : " +model);
        System.out.println("Price : " +price);
        System.out.println("year : " +year);
    }

    public static void main(String[] args){
        Car c = new Car();
        c.printDetails();
    }
}