package constructors;

public class Default {
    String name;
    int id;
    double salary;
    void display(){
        System.out.println(id+""+name+""+salary);
    }
    public static void main(String[] args){
        Default obj = new Default();
        obj.display();
    }
}
