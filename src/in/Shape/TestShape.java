package in.Shape;

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.calculateArea());

        Square s = new Square(2,2);
        System.out.println(s.calculateArea());



    }
}
