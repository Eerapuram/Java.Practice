package encapsulation;

public class Bike {
    private String name = "Classic 350";
    private double milage;
    private int price = 400000;

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
