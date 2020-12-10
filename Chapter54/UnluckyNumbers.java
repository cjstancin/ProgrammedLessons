import java.util.*;

public class UnluckyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        long number = scan.nextLong();
        String status = "not evil";

        if (testNumber(number)) {
            status = "evil";
        } 
        System.out.println(number + " is " + status);
    }
    public static boolean testNumber(long num) {
        long remainder = num / 10;
        return remainder == 13;
    }
}