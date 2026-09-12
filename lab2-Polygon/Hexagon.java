public class Hexagon implements Polygon{
    protected double side = 0;
    @Override
    public double area() {
        return (3 * Math.sqrt(3)/2) * Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return side * 6;
    }
    Hexagon(double side){
        this.side = side;
    }
}

