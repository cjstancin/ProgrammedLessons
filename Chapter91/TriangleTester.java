import java.util.Scanner;

public class TriangleTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("n is >= 0. Try again.");
        } else {
            System.out.println(Triangle(n));
        }
    }

    public static int Triangle(int n) {
        if (n == 1) return 1;

        return n + Triangle(n - 1);
    }
}