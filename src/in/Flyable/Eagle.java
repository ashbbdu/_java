package in.Flyable;

    public class Eagle extends Bird {

    // this is required
    //        "Call the constructor of the parent class (Bird) and pass 'Eagle' as breed"
    public Eagle () {
        super("Eagle");
    }
    @Override
    public void flyable () {
        System.out.println("The bird is flying");
    }
}
