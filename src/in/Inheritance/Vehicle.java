package in.Inheritance;

public class Vehicle {
//    public int numberOfTyres;

    private int numberOfTyres;

    public void setNumberOfTyres (int numberOfTyres) {
        this.numberOfTyres = this.numberOfTyres + numberOfTyres;
    }

    public void commute () {
        System.out.println("I am going from place A to place B using tyres : " + numberOfTyres);
    }
}
