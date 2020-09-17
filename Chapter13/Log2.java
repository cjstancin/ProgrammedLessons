import java.util.Scanner;

public class Log2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number: ");
        double number = scanner.nextDouble();
        double ans = Math.log(number) / Math.log(2.0);
        System.out.println("Log base 2 of " + number + " is " + ans);
    }
}