package interfacee;

import inheritance.Car;

public class MultipleInheritance1 extends Car implements Interface1,Interface2{
    public static void main(String[] args){
        Car obj = new Car();
        obj.displayCarInfo();
        Interface1.printValues1();
        Interface2.printValues2();
    }
}
