public class EquilateralTriangle extends Triangle{
    protected double side;
    EquilateralTriangle(double side){
        super();
        this.side = side;
    }
    @Override
    public double perimeter() {
        return side * 3;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) * Math.pow(side, 2))/4;
    }
}
