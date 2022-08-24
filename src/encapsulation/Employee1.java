package encapsulation;

public class Employee1 {
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.getName();
        obj.setDesignation("Developer");
        obj.setSalary(60000);
        System.out.println(obj.getName());
        System.out.println(obj.getDesignation());
        System.out.println(obj.getSalary());
    }
}