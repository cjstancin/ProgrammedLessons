import java.util.Scanner;
import java.util.Random;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int first = 1 + random.nextInt(10);
        int second = 1 + random.nextInt(10);
        int score = 0;
        int i = 0;

        while (i < 10) {
            i++;
            System.out.println("What is " + first + " times " + second + "?");
            int answer = scanner.nextInt();
            if (answer == first*second) {
                score++;
                first = 1 + random.nextInt(10);
                first = 1 + random.nextInt(10);
            } else {
                first = 1 + random.nextInt(10);
                second = 1 + random.nextInt(10);
            }
        }

        
        System.out.println("You got " + score + " right.");
    }
}