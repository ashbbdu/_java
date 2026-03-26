package in.Overriding;

public class Dog extends Animal {
    Dog () {
       super(4 );
    }
//


    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.numberOfLegs);
        d.sound();
    }
}
