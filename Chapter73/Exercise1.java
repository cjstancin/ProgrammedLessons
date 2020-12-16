import java.util.Scanner;
import java.io.*;

public class Exercise1 {
    public static void main(String[] args) {
        File file;
        Scanner scan;
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter file name (enter \"quit\" to end)");
        String fileName = scanner.nextLine();
        
        while (!fileName.equals("done")) {
            try {
                file = new File(fileName);
                scan = new Scanner(file);
                int sum = 0;
                int count = 0;

                while (scan.hasNextInt()){
                    int num = scan.nextInt();
                    count++;
                    sum += num;
                    total += num;
                }
                double avg = sum / count;
                System.out.println("Average: " + avg);
                System.out.println("Enter file name or type done to quit");
                fileName = scanner.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                System.exit(0);
            }
        }
        scanner.close();
        System.out.println("Total sum: " + total);
    }
}