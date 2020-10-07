import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a low number");
        int low = scanner.nextInt();
        System.out.println("Choose a high number");
        int high = scanner.nextInt();

        int lowsum = (((low - 1) * ((low - 1) + 1)) / 2);
        int highsum = (high * (high + 1)) / 2;

        System.out.println("Sum: " + (highsum - lowsum));
    }
}