import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Radius: ");
        double radius = scanner.nextDouble();
        double ans = Math.PI * (radius*radius);
        System.out.println("The area of the circle is " + ans);

    }
}