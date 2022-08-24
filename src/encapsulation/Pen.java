package encapsulation;

public class Pen {
    private String name = "pilot";
    private int price = 40;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(int price) {
        this.price = price;
    }
}
