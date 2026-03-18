package in.Inheritance;

public class Vehicle {
//    public int numberOfTyres;

//    private int numberOfTyres;
    // it is advised to use protected in inheritance
    protected int numberOfTyres;

    public void setNumberOfTyres (int numberOfTyres) {
        this.numberOfTyres = this.numberOfTyres + numberOfTyres;
    }

    @Override
    public String toString () {
        return "To string over-ride";
    }

    public void commute () {
        System.out.println("I am going from place A to place B using tyres : " + numberOfTyres);
    }
}
