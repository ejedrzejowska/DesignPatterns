package employee;

public class Dispatcher extends Employee {
    public Dispatcher(String fullName, double salary, EmployeeType employeeType) {
        super(fullName, salary, employeeType);
    }
    @Override
    public String showEmployeeDetails() {
        return "FullName: " + getFullName() + " EmployeeType: " + getEmployeeType();
    }
}
