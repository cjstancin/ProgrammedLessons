import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your first number?");
        double x = scanner.nextDouble();
        System.out.println("What number would you like to power it to?");
        int power = scanner.nextInt();
        int count = power;
        double result = x;

        if (power != Math.abs(power)) {
            System.out.println("The Power must be positive");
        } else {
            while (count > 1) {
                result = result * x;
                count = count - 1;
            }
        }
        System.out.println("Your answer is " + result); 
    }
}