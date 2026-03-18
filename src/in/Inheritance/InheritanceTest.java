package in.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vh = new Vehicle();
        TwoWheeler tw = new TwoWheeler();

        vh.commute();
        tw.commute();

        tw.balance();

        System.out.println("Motorcycle class");
        MotorCycle pulsar = new MotorCycle();
        pulsar.commute();
        pulsar.start();
        pulsar.balance();
    }
}
