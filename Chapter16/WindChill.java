import java.util.Scanner;

public class WindChill{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the wind speed?");
        double speed = scanner.nextDouble();
        System.out.println("What's the temperature?");
        double temp = scanner.nextDouble();
        double chill = 0;
        if ((speed < 3) || (temp > 50)) {
            chill = temp;
        } else {
            chill = 35.74 + 0.6215*temp - 35.75 * Math.pow(speed, 0.16) + 0.4275*temp*Math.pow(speed, 0.16);
        }
        System.out.println("The wind chill is " + chill);
    }
}