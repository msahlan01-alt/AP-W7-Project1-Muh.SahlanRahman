package lab.activity.week;

public abstract class Employee implements IPayable {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() { return name; }
    public String getEmployeeId() { return employeeId; }
}