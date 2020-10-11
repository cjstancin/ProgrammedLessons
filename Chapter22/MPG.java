import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initial = 0;
        double end = 0;
        double gal = 0;
        double mpg = 0;

        System.out.println("What are your initial miles?");
        initial = scanner.nextDouble();
        while (initial == Math.abs(initial)){
            System.out.println("What are your final miles?");
            end = scanner.nextDouble();
            System.out.println("How many gallons?");
            gal = scanner.nextDouble();

            mpg = (end - initial) / gal;
            System.out.println("Miles per gallon: " + mpg);
            
            System.out.println("What are your initial miles? Enter a negative number to stop.");
            initial = scanner.nextDouble();
        }
    }
}