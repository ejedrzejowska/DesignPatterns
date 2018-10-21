package employee;

public class FieldTechnician extends Employee {
    public FieldTechnician(String fullName, double salary, EmployeeType employeeType) {
        super(fullName, salary, employeeType);
    }
    @Override
    public String showEmployeeDetails() {
        return "FullName: " + getFullName() + " EmployeeType: " + getEmployeeType()
                + " salary: " + getSalary();
    }
}
