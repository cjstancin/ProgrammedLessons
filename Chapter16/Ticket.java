import java.util.Scanner;

public class Ticket {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your age?");
        int age = scanner.nextInt();
        System.out.println("What's the time?");
        int time = scanner.nextInt();
        double price;
        
        if ((age >= 13) && (time < 1700)) {
            price = 5.00;
        } else if ((age <= 13 && time < 1700)) {
            price = 2.00;
        } else if ((age <= 13 && time >= 1700)) {
            price = 4.00;
        } else {
            price = 8.00;
        }

        System.out.println("Ticket price: " + price + "$");
    }
}