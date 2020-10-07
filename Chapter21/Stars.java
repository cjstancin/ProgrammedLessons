import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many stars do you want to start out with?");
        int stars = scanner.nextInt();
        int i = 0;

        String star = new String(new char[stars]).replace('\0','*');
        while(i < stars){
            System.out.println(star.substring(0, star.length() - i));
            i++;
        }
    }
}