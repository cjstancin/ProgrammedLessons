import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input price of purchase: ");
        int price = scanner.nextInt();
        int ans = 0;
        if (price > 1000) {
            ans = price - (price/10);
        } else {
            ans = price;
        }
        System.out.println("Discounted Price: " + ans);

    }
}