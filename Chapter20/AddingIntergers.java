import java.util.Scanner;

public class AddingIntergers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers will be added?");
        int amount = scanner.nextInt();
        int sum = 0;

        while (amount > 0){
            System.out.println("What's the integer?");
            sum = sum + scanner.nextInt();
            amount = amount - 1;
        }
        System.out.println("The sum is " + sum);
    }
}