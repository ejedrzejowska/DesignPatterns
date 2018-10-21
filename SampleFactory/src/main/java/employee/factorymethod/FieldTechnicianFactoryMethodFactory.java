package employee.factorymethod;

import employee.Employee;
import employee.EmployeeType;
import employee.FieldTechnician;

public class FieldTechnicianFactoryMethodFactory extends EmployeeFactoryMethodFactory{
    @Override
    public Employee createEmployee(double salary, String fullName) {
        return new FieldTechnician(fullName, salary, EmployeeType.FIELD_TECHNICIAN);
    }
}
