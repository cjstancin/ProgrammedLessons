import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the limit?");
        double limit = scanner.nextDouble();
        double sum = 0;

        while (limit > 0) {
            sum = sum + (1.0 / limit);
            limit = limit - 1;
        }
        System.out.println("The sum is " + sum);
    }
}
