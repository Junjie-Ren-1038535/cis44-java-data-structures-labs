import java.math.*;
import java.lang.*;
import java.util.Scanner;
public class Lab2Main {
    public static void main(String[] args){
        System.out.println("Please Choose a Polygon " +
                           "Available: (IsoscelesTriangle, EquilateralTriangle, Rectangle, Square, Pentagon, Hexagon, and Octagon)");
        Scanner cin = new Scanner(System.in);
        String choice = cin.nextLine();
        if(choice.equals("IsoscelesTriangle")){
            System.out.println("Please enter the base and height for the IsoscelesTriangle");
            IsoscelesTriangle A = new IsoscelesTriangle(cin.nextDouble(), cin.nextDouble());
            System.out.println("area: " + A.area() + " perimeter: " + A.perimeter());
        }
        else if(choice.equals("EquilateralTriangle")){
            System.out.println("Please enter the base for the EquilateralTriangle");
            EquilateralTriangle A = new EquilateralTriangle(cin.nextDouble());
            System.out.println("area: " + A.area() + " perimeter: " + A.perimeter());
        }
        else if(choice.equals("Rectangle")){
        System.out.println("Please enter the length and width for the Rectangle");
        Rectangle A = new Rectangle(cin.nextDouble(), cin.nextDouble());
        System.out.println("area: " + A.area() + " perimeter: " + A.perimeter());
        }
        else if(choice.equals("Square")){
            System.out.println("Please enter the side length for the Square");
            Square A = new Square(cin.nextDouble());
            System.out.println("area: " + A.area() + " perimeter: " + A.perimeter());
        }
        else if(choice.equals("Pentagon")){
            System.out.println("Please enter the side length for the Pentagon");
            Pentagon A = new Pentagon(cin.nextDouble());
            System.out.println("area: " + A.area() + " perimeter: " + A.perimeter());
        }
        else if(choice.equals("Hexagon")){
            System.out.println("Please enter the side length for the Hexagon");
            Hexagon A = new Hexagon(cin.nextDouble());
            System.out.println("area: " + A.area() + " perimeter: " + A.perimeter());
        }
        else if(choice.equals("Octagon")){
            System.out.println("Please enter the side length for the Octagon");
            Octagon A = new Octagon(cin.nextDouble());
            System.out.println("area: " + A.area() + " perimeter: " + A.perimeter());
        }
        else{
            System.out.println("Invalid Input!");
        }
    }
}