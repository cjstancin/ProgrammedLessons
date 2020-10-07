import java.util.Scanner;

public class JetLag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long was your flight?");
        double time = scanner.nextInt();
        System.out.println("How many time zones did you cross?");
        double zones = scanner.nextInt();
        System.out.println("What time did you depart?");
        double DepartTime = scanner.nextInt();
        System.out.println("What time will you arrive?");
        double ArriveTime = scanner.nextInt();
        double depart = 0;
        double arrive = 0;

        if (8 <= DepartTime && DepartTime < 12) {
            depart = 0;
        } else if (12 <= DepartTime && DepartTime < 18) {
            depart = 1;
        } else if (18 <= DepartTime && DepartTime < 22) {
            depart = 3;
        } else if (22 <= DepartTime && DepartTime < 1) {
            depart = 4;
        } else if (1<= DepartTime && DepartTime < 8) {
            depart = 5;
        }

        if (8 <= ArriveTime && ArriveTime < 12) {
            arrive = 4;
        } else if (12 <= ArriveTime && ArriveTime < 18) {
            depart = 2;
        } else if (18 <= ArriveTime && ArriveTime < 22) {
            depart = 0;
        } else if (22 <= ArriveTime && ArriveTime < 1) {
            depart = 1;
        } else if (1<= ArriveTime && ArriveTime < 8) {
            depart = 3;
        }
        double recovery = ((time / 2) + (zones - 3) + depart + arrive) / 10;
        System.out.println("You will need " + recovery + " days to recover");
    }
}
