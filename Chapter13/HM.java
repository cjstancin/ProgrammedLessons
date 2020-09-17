import java.util.Scanner;

public class HM{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = scanner.nextDouble();
        System.out.println("Input y: ");
        double y = scanner.nextDouble();
        double Amean = (x + y) / 2;
        double Hmean = 2 / ((1/x) + (1/y));
        System.out.println("Arithmetic mean: " + Amean);
        System.out.println("Harmonic mean: " + Hmean);
    }
}