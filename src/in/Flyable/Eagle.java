package in.Flyable;

    public class Eagle extends Bird {

    // this is required
    public Eagle () {
        super("Eagle");
    }
    @Override
    public void flyable () {
        System.out.println("The bird is flying");
    }
}
