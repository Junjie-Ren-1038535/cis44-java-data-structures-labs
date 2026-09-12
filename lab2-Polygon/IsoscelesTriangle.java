public class IsoscelesTriangle extends Triangle{
    private double longside = 0;
    IsoscelesTriangle(double base, double height){
        super(base, height);
        this.longside = Math.sqrt(Math.pow(height,2)+Math.pow(base/2, 2));
    }
    @Override
    public double area(){
        return 0.5 * this.getBase() * this.getHeight();
    }

    @Override
    public double perimeter() {
        return this.getBase() + Math.sqrt(Math.pow(this.getBase(), 2) + 4 * Math.pow(this.getHeight(),2));
    }
}
