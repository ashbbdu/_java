package ClassAndObjects;

public class Car {



    int numberOfWheels;
    private String color;
    float maxSpeed;
    float currentFuelInLiters;
    int numberOfSeats;


    Car () {
       this.numberOfWheels = 5;
       this.color = "Black";
       this.maxSpeed = 120.00F;
       this.currentFuelInLiters = 20.0F;
       this.numberOfSeats = 7;
    }

    Car (int _numberOfWheels , String _color ,  float _maxSpeed , float _currentFuelInLiters , int _numberOfSeats ) {
        this.numberOfWheels = _numberOfWheels;
        this.color = _color;
        this.maxSpeed = _maxSpeed;
        this.currentFuelInLiters = _currentFuelInLiters;
        this.numberOfSeats = _numberOfSeats;
    }

    public void start () {
        if(currentFuelInLiters <= 0) {
            System.out.println("Fuel empty , you can not drive");
        } else {
            System.out.println("Car is started , start noise");

        }
    }

    public void drive () {

        this.currentFuelInLiters =  this.currentFuelInLiters -1;

    }

    public void addFuel (float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelInLiters () {
        return currentFuelInLiters;
    }


    public void setColor (String _color) {
        this.color = _color;
    }

    public String getColor () {
        return color;
    }

    public static void main(String[] args) {


    }
}
