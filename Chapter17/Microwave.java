import java.util.Scanner;

public class Microwave{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items are you heating up?");
        int items = scanner.nextInt();
        System.out.println("What's the time for one item?");
        int time = scanner.nextInt();
        int singlesec = time % 100 + (((time - (time % 100)) / 100) * 60);
        int minutes = 0;
        int seconds = 0;
        int totaltime = 0;

        if (items == 1) {
            minutes = (time - (time % 100)) / 60;
            seconds = time % 100;
            System.out.println("Heat for "+ minutes + " minutes and " + seconds + " seconds");
        } else if (items == 2) {
            totaltime = time + (time / 2);
            minutes = (totaltime - (totaltime % 100)) / 60;
            seconds = totaltime % 100;
            if (seconds == 60){ 
                minutes = minutes + 1;
                seconds = 0;
            }
            System.out.println("Heat for "+ minutes + " minutes and " + seconds + " seconds");
        } else if (items == 3){
            totaltime = singlesec * 2;
            minutes = (totaltime - (totaltime % 100)) / 60;
            seconds = totaltime % 100;
            if (seconds == 60){
                minutes = minutes + 1;
                seconds = 0;
            }
            System.out.println("Heat for "+ minutes + " minutes and " + seconds + " seconds");
        } else {
            System.out.println("You have input a value that is not able to be calculated");
        }
    }
}