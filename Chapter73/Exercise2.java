import java.util.Scanner;
import java.io.*;

public class Exercise2 {
    public static void main(String[] args) {
        File file;
        Scanner scan;

        try {
            file = new File("rand.csv");
            scan = new Scanner(file);
            int sum = 0;
            int group = 0;

            while (scan.hasNext()) {
                if(scan.next().equals("next")) {
                    group++;
                    while (scan.hasNextInt()) {
                        sum += scan.nextInt();
                    }
                    if (sum == 0) {
                        System.out.println("Group " + group + " contains no data.");
                    } else {
                        System.out.println("Sum of group " + group + " is " + sum);
                    }
                    sum = 0;
                } else {
                    scan.next();
                    sum = 0;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        
    }
}