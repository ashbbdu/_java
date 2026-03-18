package in.Abstraction;

// abstract keyword here will disable the creation of the object

// Why do we use abstract classes?
// To define common structure + rules for child classes.
//"An abstract class is a class that cannot be instantiated and may contain abstract methods. It is used to provide a base structure that must be extended by subclasses."


public abstract class Vehicle implements Transport {
    private int numberOfTyres;

    public abstract void makeStartVoice ();



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


    @Override
    public void getSetGo () {
        System.out.println("Get Set Goooo !");
    }


}
