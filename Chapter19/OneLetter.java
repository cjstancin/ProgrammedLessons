import java.util.Scanner;

public class OneLetter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What word would you like to break up?");
        String word = scanner.next();
        int index = 0;

        while(index < word.length()){
            System.out.println(word.charAt(index));
            index = index + 1;
        }
    }
}