import java.util.Scanner;

public class SimpleCalc{
    public static class Calculator{
        public static double addition(double x1, double x2){
            return x1 + x2;
        }
        public static double subtraction (double x1, double x2){
            return x1 - x2;
        }
        public static double division (double x1, double x2){
            return x1 / x2;
        }
        public static double multiplication (double x1, double x2){
            return x1 * x2;
        }
    }
    public static void main(String[] args){
        boolean cont = true;
        Scanner cin = new Scanner(System.in);
        String operation = "!";
        double x1 = 0;
        double x2 = 0;
        System.out.println("Enter the first number: (q to quit)");
        String input = cin.nextLine();
        if (input.equals("q")){
            cont = false;
        }else {
            x1 = Integer.parseInt(input);
        }
        while (cont){
            double x3 = 0;
            System.out.println("Enter the operation: (q to quit)");
            operation = cin.nextLine();
            if (operation.equals("q")){
                cont = false;
                break;
            }
            System.out.println("Enter the second number: (q to quit)");
            input = cin.nextLine();
            if (input.equals("q")){
                cont = false;
                break;
            }else {
                x2 = Integer.parseInt(input);
            }
            if (operation.equals("+")){
                x3 = Calculator.addition(x1, x2);
            } else if (operation.equals("-")){
                x3 = Calculator.subtraction(x1, x2);
            } else if (operation.equals("*")){
                x3 = Calculator.multiplication(x1, x2);
            } else if (operation.equals("/")){
                x3 = Calculator.division(x1, x2);
            } else {
                System.out.println(operation.charAt(0) + " is not a valid expression");
                break;
            }
            System.out.printf("Equation: %f %c %f = %f\n", x1, operation.charAt(0), x2, x3);
            x1 = x3;
        }
    }
}