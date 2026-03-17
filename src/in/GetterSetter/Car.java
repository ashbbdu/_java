package in.GetterSetter;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    private double cost;


    Car () {}

//    the idea is make variables private and make the methods public

    public String getColor () {
        return color;
    }

    public void setColor (String _color) {
        this.color = _color;
    }
    

}
