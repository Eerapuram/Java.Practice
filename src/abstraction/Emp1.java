package abstraction;

public class Emp1 {
    void getName(){
        System.out.println("PQR");
    }
    void getEmpID(){
        System.out.println(5678);
    }
    void getDesignation(){
        System.out.println("Developer");
    }
    void getSalary(){
        System.out.println(50000);
    }

    public static void main(String[] args){
        Emp1 e = new Emp1();
        e.getName();
        e.getEmpID();
        e.getDesignation();
    }
}
