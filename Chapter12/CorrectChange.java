import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Money: ");
        int money = scanner.nextInt();
        int dollars = money / 100;
        money = money - (dollars * 100);
        int quarters = (money % 100) / 25;
        money = money - (quarters * 25);
        int dimes = (money % 25) / 10;;
        money = money - (dimes * 10);
        int nickels = (money % 10) / 5;;
        money = money - (nickels * 5);
        int pennies = (money % 5) / 1;;
        money = money - (pennies * 1);
        System.out.println("Your Change is " + dollars + " Dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s) and " + pennies + " pennie(s)");
       
    }
    
}

