public class Octagon implements Polygon{
    protected double side = 0;
    @Override
    public double area() {
        return 2*(1 + Math.sqrt(2)) * Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return side * 8;
    }
    Octagon(double side){
        this.side = side;
    }
}
