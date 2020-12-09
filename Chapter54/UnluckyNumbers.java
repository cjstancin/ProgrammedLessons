import java.util.*;

public class UnluckyNumbers{

    public static boolean testNumber(long num) {
        long remainder = num / 10;
        return remainder == 13;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        long num = scan.nextLong();
        String status = "safe";

        if (testNumber(num)) {
            status = "unlucky";
        } 
        System.out.println(num + " is " + status);
    }
}