package employee;

public class Manager extends Employee {
    public Manager(String fullName, double salary, EmployeeType employeeType) {
        super(fullName, salary, employeeType);
    }
    @Override
    public String showEmployeeDetails() {
        return "FullName: " + getFullName();
    }
}
