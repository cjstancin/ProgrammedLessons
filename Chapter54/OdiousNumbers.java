import java.util.Scanner;

public class OdiousNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        long num = scan.nextLong();

        while (num > 0){
            if (testNumber(num)) {
                System.out.println(num + " is odious");
            } else {
                System.out.println(num + " is evil");
            }

            System.out.println("Enter a number");
            num = scan.nextLong();
        }
    }
    public static boolean testNumber(long n) {
        int total = 1;
        long num = n;

        while (num / 2 != 0) {
            total += num % 2;
            num = num / 2;
        }
        return n % 2 == 1;
    }
}