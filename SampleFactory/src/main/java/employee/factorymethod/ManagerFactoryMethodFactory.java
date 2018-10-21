package employee.factorymethod;

import employee.Employee;
import employee.EmployeeType;
import employee.Manager;

public class ManagerFactoryMethodFactory extends EmployeeFactoryMethodFactory {
    @Override
    public Employee createEmployee(double salary, String fullName) {
        return new Manager(fullName, salary, EmployeeType.MANAGER);
    }
}
