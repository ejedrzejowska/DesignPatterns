package employee;

public abstract class Employee {
    private String fullName;
    private double salary;
    private EmployeeType employeeType;

    public Employee(String fullName, double salary, EmployeeType employeeType) {
        this.fullName = fullName;
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public abstract String showEmployeeDetails();
}
