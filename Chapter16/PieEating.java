import java.util.Scanner;

public class PieEating{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your weight?");
        double weight = scanner.nextDouble();
        if ((weight <= 220) || (weight >= 280)){
            System.out.println("You can't enter the State Fair Pie Eating Contest.");
        } else {
            System.out.println("You can enter the State Fair Pie Eating Contest.");
        }
    }
}