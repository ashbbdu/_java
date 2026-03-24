package in.Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c  = new Car();
        Vehicle v = new Vehicle();
        Vehicle var = new Car();

//        Car vh =  (Car) new Vehicle(); // MTBL kya har vehicle car hai , which is false so that is wny error is coming
    }
}
