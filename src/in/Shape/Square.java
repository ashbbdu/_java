package in.Shape;

public class Square extends Shape {
    private double height;
    private double width;

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }



    @Override
    public double calculateArea() {
        return height * width;
    }
}
