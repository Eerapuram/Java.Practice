package encapsulation;

public class Employee {
    private String name = "ABC";
    private String designation = "QA";
    private int salary = 40000;

    public String getName() {
        return name;
    }
    public String getDesignation(){
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
