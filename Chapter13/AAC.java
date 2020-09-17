import java.util.Scanner;

public class AAC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input cost per kilowatt per hour: ");
        double cost = scanner.nextDouble();
        System.out.println("Input kilowatts per hour a year: ");
        int hours = scanner.nextInt();
        double ans = (cost * hours) / 100; 
        System.out.println("Annual cost: " + ans);
    }
}