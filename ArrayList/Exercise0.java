import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise0 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("peach","blueberry","strawberry","apple","orange","lemon","lime","banana","cantaloupe","watermelon"));
        ArrayList<String> vegetables = new ArrayList<String>(Arrays.asList("lettuce","eggplant","pepper","onion","lettuce","cabbage","carrot","potato","cucumber","eggplant"));
        ArrayList<String> combined = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            combined.add(fruits.get(i));
            combined.add(vegetables.get(i));
        }
        
        System.out.println("Before: ");
        for (String n : combined) {
            System.out.print(n + " ");
        }

        Collections.sort(combined);

        System.out.println("\nAfter sorting: ");
        for (String n : combined) {
            System.out.print(n + " ");
        }
    }
}