import java.util.Scanner;

public class PantryTester {
  public static void main (String[] args) {
    Jam goose = new Jam("Gooseberry", "7/4/86", 12);
    Jam apple = new Jam("Crab Apple", "9/30/99", 8);
    Jam rhubarb  = new Jam("Rhubarb", "10/31/99", 3);

    Pantry hubbard = new Pantry(goose, apple, rhubarb);
    System.out.println(hubbard);

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter selection (1, 2, or 3). Enter 4 to quit.");
    int userSelect = scan.nextInt();

    while (userSelect != 4) {
      System.out.println("Enter amount to spread");
      int userSpread = scan.nextInt();
      
      hubbard.select(userSelect);
      hubbard.spread(userSpread);
      System.out.println(hubbard);
      System.out.println("Enter selection (1, 2, or 3). Enter 4 to quit.");
      userSelect = scan.nextInt();
    }
  }
}