import java.util.Scanner;

public class Y2K{
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("When were you born?");
        int born = scanner.nextInt();
        System.out.println("What year is it?");
        int now = scanner.nextInt();
        int age = 0;
        
        if (born < now) {
            age = now - born;
        } else if (born > now) {
            now = now + 100;
            age = now - born;
        }
        System.out.println("Your age is " + age);
    }
}