import java.util.Scanner;

public class WordDot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your first word?");
        String first = scanner.next();
        System.out.println("What's your second word?");
        String second = scanner.next();
        int count = first.length() + second.length();

        System.out.print(first);
        while (count < 30) {
            System.out.print(".");
            count = count + 1;
        }
        System.out.print(second);
    
    }
}
