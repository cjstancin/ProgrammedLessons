import java.util.Scanner;

public class DivSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println("your number is a perfect number.");
        }
        System.out.println("The sum of odds is" + sum);
    }
}