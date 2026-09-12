public class Quadrilateral implements Polygon{
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;
    Quadrilateral(double side1, double side2, double side3, double side4){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;

    }
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return this.side1 + this.side2 + this.side3 + this.side4;
    }
}
