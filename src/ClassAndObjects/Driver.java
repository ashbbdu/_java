package ClassAndObjects;

public class Driver {

    String name;
    String dateOfLicense;


    public  void getLicenseDetails () {
        System.out.println(dateOfLicense);
    }

    public static void main(String[] args) {
//        Car car = new Car();
//        car.addFuel(6);
//        car.drive();
//        car.drive();
//        car.drive();
//        car.drive();
//        car.drive();
//        car.drive();
//        car.drive();
//        System.out.println(car.getCurrentFuelInLiters());


//        Car swift = new Car();
//        swift.addFuel(10);
//        swift.start();
//
//        swift.drive();
//        Driver driver = new Driver();
//        driver.dateOfLicense = "24Jan2026";
//
//     driver.getLicenseDetails();


        Car safari = new Car();
//        System.out.println(safari.color);
//
//        safari.color = "Red";
//        System.out.println(safari.color);

        System.out.println(safari.getColor());

        safari.setColor("Red");
        System.out.println(safari.getColor());

        Car hondaCity = new Car(12 , "Blue" , 120.98F ,40.00F , 10);
        System.out.println(hondaCity.getCurrentFuelInLiters());

    }
}
