import java.util.Scanner;

public class MatrixMain {
    public static void main(String[] args){
        Matrix a = new Matrix(4, 5);
        Matrix b = new Matrix(5, 5);
        Matrix c = new Matrix(5, 5);
        a.populateRandom();
        b.populateRandom();
        System.out.print(a.toString() + "\n");
        System.out.print(b.toString() + "\n");
        try {
            a.add(b);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter a new matrix dimension");
            Scanner cin = new Scanner(System.in);
            int row = cin.nextInt();
            int col = cin.nextInt();
            b = new Matrix(row, col);
            b.populateRandom();
            a.add(b);
        }
        System.out.print(a.toString() + "\n");
        try {
            a.multiply(c);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter a new matrix dimension");
            Scanner cin = new Scanner(System.in);
            int row = cin.nextInt();
            int col = cin.nextInt();
            c = new Matrix(row, col);
            c.populateRandom();
            a.multiply(c);
        }
        System.out.println(a.toString() + "\n");
    }
}