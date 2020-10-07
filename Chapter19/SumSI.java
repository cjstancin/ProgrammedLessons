import java.util.Scanner;
public class SumSI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int ans = 0;
        
        int formula = (n * (n + 1)) / 2;
        while (n > 0){
            ans = ans + n;
            n = n - 1;
        }
        
        System.out.println("Loop sum: " + ans + "\nFormula sum: " + formula);
    }
}