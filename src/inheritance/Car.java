package inheritance;

public class Car {
    String carName ="BMW";
    int maximumspeed =250;
    int mileage =9;
    String color = "Black";
    String model = "Series 8";
    public void displayCarInfo(){
        System.out.println(carName);
        System.out.println(color);
        System.out.println(model);
        System.out.println(maximumspeed);
        System.out.println(mileage);
    }
    public static void main(String args[]){
        Car obj= new Car();
        obj.displayCarInfo();
    }

}