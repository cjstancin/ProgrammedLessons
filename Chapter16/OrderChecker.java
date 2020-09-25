import java.util.Scanner;

public class OrderChecker{
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bolts: ");
        int bolts = scanner.nextInt();
        System.out.println("Nuts: ");
        int nuts = scanner.nextInt();
        System.out.println("Washers: ");
        int washers = scanner.nextInt();

        if ((nuts >= bolts) && (washers >= (2 * bolts))){
            System.out.println("Order is OK.");
        } else if (nuts < bolts) {
            System.out.println("Too few nuts");
        } else if (washers < (2 * bolts)){
            System.out.println("Too few washers");
        }

        int boltCost = 5 * bolts;
        int nutCost = 3 * nuts;
        int washerCost = 1 * washers;
        int total = boltCost + nutCost + washerCost;
        System.out.println("Total cost: " + total);
    }
}