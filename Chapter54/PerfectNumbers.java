import java.util.Scanner;

public class PerfectNumbers {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++){
            sum += i;
        }
        return sum == n;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit");
        int limit = scan.nextInt();
        for (int j = 0; j < limit; j++){
            if (isPerfect(j)){
                System.out.println(j);
            }
        }
    }
}