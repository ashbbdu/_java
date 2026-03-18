package in.Abstraction;

public class Car extends Vehicle {

    private int numberOfDoors;
    Car () {

//        "super() is used to call the parent class constructor to initialize inherited properties "
//        "super() is used to call the parent class constructor to initialize inherited properties. If the parent class does not have a no-argument constructor, then the child class must explicitly call a parameterized constructor using super(...)."
        super(4);


    }
}
