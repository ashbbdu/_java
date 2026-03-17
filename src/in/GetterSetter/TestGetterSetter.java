package in.GetterSetter;

public class TestGetterSetter {
    public static void main(String[] args) {
        Car swift = new Car();
//        swift.color = "red";
//        System.out.println(swift.color);

        swift.setColor("green");
        System.out.println(swift.getColor());

    }
}
