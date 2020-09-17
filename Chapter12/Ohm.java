import java.util.Scanner;

public class Ohm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the Voltage? ");
        int volt = scanner.nextInt();
        System.out.println("What's the Resistance? ");
        int resistance = scanner.nextInt();
        double ans = (volt + 0.0) / resistance;
        System.out.println("The Current is " + ans);
    }
}