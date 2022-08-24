package inheritance;

public class Employee {
    String name = "XYZ";
    int empId = 1234;
    String designation = "Developer";
    String CTC = "9LPA";
    void displayEmployeeInfo(){
        System.out.println(name);
        System.out.println(empId);
        System.out.println(designation);
        System.out.println(CTC);
    }
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.displayEmployeeInfo();
    }
}
