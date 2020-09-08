public class Payroll {
    public static void main (String[] args) {
        long hoursWorked;
        double payRate , taxRate;
        hoursWorked = 10;
        payRate = 2.0;
        taxRate = 0.1;

        System.out.println("Hours Worked:   " + hoursWorked);
        System.out.println("pay Amount  : " + (hoursWorked * payRate) );
        System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
    }
}