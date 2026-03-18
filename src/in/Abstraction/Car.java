package in.Abstraction;

public class Car extends Vehicle {

    private int numberOfDoors;
    Car () {

//        "super() is used to call the parent class constructor to initialize inherited properties "
//        "super() is used to call the parent class constructor to initialize inherited properties. If the parent class does not have a no-argument constructor, then the child class must explicitly call a parameterized constructor using super(...)."
        super(4);

    }

//    since we have created an abstract method that is why here we are over riding

//    If a parent class has an abstract method, then every concrete (non-abstract) child class must implement that method.
    @Override
    public void makeStartVoice () {
        System.out.println("Car Grrrrr");
    }


//    we can set this here also and in Vehicle also
//    @Override
//    public void getSetGo () {
//        System.out.println("Get Set Goooo !");
//    }
}
