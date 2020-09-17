import java.util.Scanner;

public class FurtherSubstring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String str = scanner.nextLine();
        System.out.println("Input starting index");
        int starting = scanner.nextInt();
        System.out.println("Input ending index");
        int ending = scanner.nextInt();
        
        System.out.println("Original String: " + str);
        System.out.println("New substring: " + str.substring(starting, ending));
    }
}