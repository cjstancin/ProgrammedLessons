import java.util.Scanner;

public class DtoR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Degrees ");
        double degrees = scanner.nextDouble();
        double rad = degrees * Math.PI/180;
        System.out.println("Degrees converted to Radians: " + rad);

    }
}