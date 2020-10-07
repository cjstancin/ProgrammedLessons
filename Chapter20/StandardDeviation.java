import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many points will you have?");
        int i = scanner.nextInt();
        int n = i;
        double sum = 0;
        double sumsqr = 0;
        double num = 0;
        double average = 0;
        double avgsquare = 0;
        double sd = 0;

        while (i > 0) {
            System.out.println("What's number will you input?");
            num = scanner.nextDouble();
            sum = sum + num;
            sumsqr = sumsqr + (num * num);
            i = i - 1;
        }
        average = sum / n;
        avgsquare = sumsqr / n;
        sd = Math.sqrt(avgsquare - (average * average));
        System.out.println("Average: " + average);
        System.out.println("Standard deviation: " + sd);
    }
}
