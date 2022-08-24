package constructors;

public class Parameterized {
    String name;
    int id;
    double salary;
    Parameterized(String i, int j, double k)
    {
        name = i;
        id = j;
        salary = k;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
    public static void main(String[] args){
        Parameterized x = new Parameterized("ABC", 123, 5862.56);
        Parameterized y = new Parameterized("PQR", 456, 5465.69);
        Parameterized z = new Parameterized("XYZ", 789, 8465.99);
        x.display();
        y.display();
        z.display();
    }
}

