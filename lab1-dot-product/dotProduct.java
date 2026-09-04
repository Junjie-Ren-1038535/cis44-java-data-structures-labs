import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class dotProduct{
    public static void main(String[] args){
        Random r = new Random();
        System.out.println("Enter a number for the length of the array: ");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        ArrayList<Integer> b = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            a.add(r.nextInt() % 10);
            b.add(r.nextInt() % 10);
        }
        ArrayList<Integer> c = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            c.add(a.get(i) * b.get(i));
        }
        for (int i = 0; i < n; i++){
            System.out.println("index " + i + ": ");
            System.out.printf("a: %d, b: %d, c: %d\n", a.get(i), b.get(i), c.get(i));
        }
    }
}