import java.util.Scanner;

public class RunofIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to start at?");
        int start = scanner.nextInt();
        System.out.println("What number do you want to end at?");
        int end = scanner.nextInt();
        while(start <= end) {
            System.out.println(start);
            start = start + 1;
        }
    }
}