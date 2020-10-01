import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        System.out.println("Welcome to A Basic MMORPG");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to name your character?");
        String name = scanner.nextLine();
        System.out.println("Time to assign points! Remember you can only have a total of 10 points assigned");
        System.out.println("Enter strength (1-10)");
        int strength = scanner.nextInt();
        System.out.println("Enter health (1-10)");
        int health = scanner.nextInt();
        System.out.println("Enter luck (1-10)");
        int luck = scanner.nextInt();

        if (strength + health + luck > 15) {
            strength = 5;
            health = 5;
            luck = 5;
            System.out.println("Whoops too many points. Default values have been assigned");
            System.out.println("Name: " + name + "\tStrength: " + strength + "\tHealth: " + health + "\tLuck: " + luck);
        } else {
            System.out.println("Name: " + name + "\tStrength: " + strength + "\tHealth: " + health + "\tLuck: " + luck);
        }
    }
}