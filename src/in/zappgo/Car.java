package in.zappgo;

public class Car {
    public String color;
    public String model;

//    private double fuelLevel;
    double fuelLevel; // lets make this default , what default will do it will only allow the access to the same package
    private long costOfPurchase;

    public Car () {

    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }


}
