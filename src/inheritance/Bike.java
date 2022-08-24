package inheritance;

public class Bike {
    String bikename ="ROYALENFIELD";
    int maximumspeed =120;
    int mileage =39;
    void displayBikeInfo(){
        System.out.println(bikename);
        System.out.println(maximumspeed);
        System.out.println(mileage);
    }
    public static void main(String args[]){
        Bike obj= new Bike();
        obj.displayBikeInfo();
    }

}