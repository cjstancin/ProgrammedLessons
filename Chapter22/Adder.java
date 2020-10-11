import java.util.Scanner;

public class Adder {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int Sum = 0;
        int SumFinal = 0;
        System.out.println("What's the low end?");
        int low = scanner.nextInt();
        System.out.println("What's the high end?");
        int high = scanner.nextInt();
        System.out.println("Enter data points");
        int data = scanner.nextInt();

        if (data < high && data > low) {
            Sum = Sum + data;
        } else {
            SumFinal = SumFinal + data;
        }

        while (data != 0){
            System.out.println("Enter data point");
            data = scanner.nextInt();
            if (data < high && data > low) {
                Sum = Sum + data;
            } else {
                SumFinal = SumFinal + data;
            }
        }

        System.out.println("Sum of in range values: " + Sum + "\nSum of out of range values: " + SumFinal);
    }
}