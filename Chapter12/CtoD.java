import java.util.Scanner;

public class CtoD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Cents: ");
        double cents = scanner.nextDouble();
        double ans = cents/100;
        System.out.println("The Dollar amount is " + ans + " dollars");

    }
}