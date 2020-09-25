import java.util.Scanner;

public class LastChance{
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input capacity of gas tank");
        int capacity = scanner.nextInt();
        System.out.println("Input percentage of gas gauge");
        int gauge = scanner.nextInt();
        System.out.println("Input Miles per Gallon");
        int mpg = scanner.nextInt();
        int total = (capacity * (gauge / 100)) * mpg;
        
        if (total < 200) {
            System.out.println("Get Gas");
        } else {
            System.out.println("You're Good");
        }
        
    }
}