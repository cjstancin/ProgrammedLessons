import java.util.Scanner;

public class AgeSec{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your age in years?");
        int years = scanner.nextInt();
        System.out.println("What's your age in months?");
        int months = scanner.nextInt();
        System.out.println("What's your age in days?");
        int days = scanner.nextInt();
        
        if (months == 1){
            days = days + 31;
        } else if (months == 2){
            days = days + 31 + 28;
        } else if (months == 3){
            days = days + 31 + 28 + 31;
        } else if (months == 4){
            days = days + 31 + 28 + 31 + 30;
        } else if (months == 5){
            days = days + 31 + 28 + 31 + 30 + 31;
        } else if (months == 6){
            days = days + 31 + 28 + 31 + 30 + 31 + 30;
        } else if (months == 7){
            days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31;
        } else if (months == 8){
            days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        } else if (months == 9){
            days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        } else if (months == 10){
            days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        } else if (months == 11){
            days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        }

        int seconds = (days + 365*years) * 86400;
        double percent = (seconds / (2.5*10e8)) * 100;
        System.out.println("You are " + seconds + " seconds old. You are " + percent + "% done with life.");

    }
}