public class Rectangle extends Quadrilateral{

    Rectangle(double length, double width) {
        super(length, width, length, width);
    }
    @Override
    public double area() {
        return this.side1 * this.side2;
    }

    @Override
    public double perimeter() {
        return this.side1 * 2 + this.side2 * 2;
    }
}
