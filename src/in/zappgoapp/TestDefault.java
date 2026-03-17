package in.zappgoapp;

import in.zappgo.Car;

public class TestDefault {
    public static void main(String[] args) {
        Car nc = new Car();
        nc.color = "yellow";
//        nc.fuelLevel
        System.out.println(nc.color);
    }
}
