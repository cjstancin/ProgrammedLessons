public class Payroll {
    private Employee payee;
    private double wage;
    private int hours;
    private double total;

    private static final double taxes = 0.15;

    public Payroll(Employee payee) {
        this.payee = payee;
        this.wage = payee.getWage();
        this.hours = payee.hours();
    }

    public getPayeeName() {
        return this.payee.getName();
    }
    
    public double getPayment() {
        total = this.wage * this.hours * (1.0 - taxes);
        return total;
    }

    public boolean isErroneous() {
        return this.wage > 100 || getPayment() > 1500;
    }

    public String toString() {
        if (isErroneous()) {
            return "Cannot give check";
        }
        return employee.getName() + " was paid " + total;
    }
}