package encapsulation;

public class Car {
    private String name = "BMW";
    private double milage = 8.5;
    private int price = 4000000;

    public String getName() {
        return name;
    }
    public double getmilage(){
        return milage;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
