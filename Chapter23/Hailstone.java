import java.util.*;

public class Hailstone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        while (number != 1) {
            int m = 0;
            if (number % 2 == 0) {
                m = number / 2;
                System.out.println(m);
                number = m;
            } else {
                m = 3 * number + 1;
                System.out.println(m);
                number = m;
            }
        }

        System.out.println("end");
    }
}