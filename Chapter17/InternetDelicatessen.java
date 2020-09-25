import java.util.Scanner;
import java.text.*;

public class InternetDelicatessen{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##0.00");
        System.out.println("What Item are you Getting?");
        String item = scanner.nextLine();
        System.out.println("Price? (in cents)");
        double price = scanner.nextDouble();
        System.out.println("Express delivery? (0==no, 1==yes)");
        double express = scanner.nextDouble();
        double delivery = 0;

        if (price >= 1000){
            delivery = 0;
        } else if (express == 1){
            delivery = 500;
        } else {
            delivery = 200;
        }

        double total = (delivery + price) / 100;
        price = price / 100;
        delivery = delivery / 100; 
        
        System.out.println("\nInvoice:\n" + item + ("   ") + price + "\nDelivery   " + delivery + "\nTotal\t" + total);
    }
}