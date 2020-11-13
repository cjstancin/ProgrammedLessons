public class Employee {
    private String name;
    private String position;
    private double wage;
    private int id;
    private int hoursWorked;
    private int totalHours;
    private static int employeeCount =0;

    public Employee(String name, String position, double wage, int id) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.id = employeeCount;
        employeeCount++;
    }

    public String getName() {return name;}
    public String getPosition() {return position;}
    public double getWage() {return wage;}
    public double getid() {return id;}
    public double gethourWorked() {return hoursWorked;}
    public double gettotalHours() {return totalHours;}

    public void setName(String name) {this.name = name;}
    public void setPosition(String position) {this.position = position;}
    public void setWage(int wage) {this.wage = wage;}


    public void hours(double hours) {
        this.hoursWorked += hours;
        this.totalHours += hours;
    }

    public Payroll requestPaycheck() {
        Payroll paycheck = new Payroll(this);
        this.hoursWorked = 0;
        return paycheck;
    }

    public String toString() {
        return "Employee name: " + name + "\nPosition: " + position + "\nWage: " + wage + "\nID: " + id + "\nHours Worked: " + hoursWorked + "/nTotal Hours: " + totalHours;
    }
}