package in.Abstraction;

public abstract class Vehicle {
    private int numberOfTyres;


    public Vehicle(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public void commute () {
        System.out.println("Going....");
    }
}
