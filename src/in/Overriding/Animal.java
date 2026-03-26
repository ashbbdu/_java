package in.Overriding;

public abstract class Animal {
    public int numberOfLegs;
    Animal (int numberOfLegs ) {
       this.numberOfLegs = numberOfLegs;
    }


//    public abstract void sound ();
    public void sound () {
        System.out.println("Default sound of animal !");
    }
}
