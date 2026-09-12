public class Pentagon implements Polygon{
    protected double side = 0;
    @Override
    public double area() {
        return 1.72048 * Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return side * 5;
    }
    Pentagon(double side){
        this.side = side;
    }
}
