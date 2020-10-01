import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to say?");
        String word = scanner.next();
        int x = 0;

        while(x < word.length()) {
            System.out.println(word);
            x = x + 1;
        }
    }
}