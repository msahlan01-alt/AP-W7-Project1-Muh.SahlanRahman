package lab.activity.week;

public class SalariedEmployee extends Employee {
    private final double weeklySalary;

    public SalariedEmployee(String name, String employeeId, double weeklySalary) {
        super(name, employeeId);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }
}