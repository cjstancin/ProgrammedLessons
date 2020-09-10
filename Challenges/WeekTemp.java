import java.util.Scanner;

public class WeekTemp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sunday");
        int sunday = scanner.nextInt();
        System.out.println("Monday");
        int monday = scanner.nextInt();
        System.out.println("Tuesday");
        int tuesday = scanner.nextInt();
        System.out.println("Wednesday");
        int wednesday = scanner.nextInt();
        System.out.println("Thursday");
        int thursday = scanner.nextInt();
        System.out.println("Friday");
        int friday = scanner.nextInt();
        System.out.println("Saturday");
        int saturday = scanner.nextInt();

        int avg = (sunday + monday + tuesday + wednesday + thursday + friday + saturday) / 7;

        System.out.println("----------------------------------");
        System.out.println("Sunday: " + sunday);
        System.out.println("Monday: " + monday);
        System.out.println("Tuesday: " + tuesday);
        System.out.println("Wednesday: " + wednesday);
        System.out.println("Thursday: " + thursday);
        System.out.println("Friday: " + friday);
        System.out.println("Saturday: " + saturday);
        System.out.println("Average Temperature this week: " + avg);
        System.out.println("----------------------------------");


    }
}