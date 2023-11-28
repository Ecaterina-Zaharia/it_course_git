public class Employee {

    private int employeeId;
    private String employeeName;

    private double employeeSalary;

    private double raisePercent;

    public Employee(int employeeId, String employeeName, double employeeSalary, double raisePercent) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.raisePercent = raisePercent;
    }

    public double raiseSalary(){
        double raiseDecimal = 0;
        double raisedDollars = 0;
        double finalSalary = 0;
        raiseDecimal = raisePercent / 100;
        raisedDollars = raiseDecimal * raisePercent;
        finalSalary = employeeSalary + raisedDollars;
        return finalSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public double getRaisePercent() {
        return raisePercent;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setRaisePercent(double raisePercent) {
        this.raisePercent = raisePercent;
    }
}