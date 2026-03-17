package in.zappgo;

public class AccessModifierTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.model = "Honda City 2026";
        c1.fuelLevel = 30.00D;
        Car c2 = new Car("Blue" , "Honda City 2026" , 20.00D , 20000L);


        System.out.println(c1.fuelLevel);
    }
}
