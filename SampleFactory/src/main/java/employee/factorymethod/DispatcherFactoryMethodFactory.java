package employee.factorymethod;

import employee.Dispatcher;
import employee.Employee;
import employee.EmployeeType;

public class DispatcherFactoryMethodFactory extends EmployeeFactoryMethodFactory {
    @Override
    public Employee createEmployee(double salary, String fullName) {
        return new Dispatcher(fullName, salary, EmployeeType.DISPATCHER);
    }
}
