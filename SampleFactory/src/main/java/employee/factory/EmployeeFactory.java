package employee.factory;

import employee.*;

public class EmployeeFactory {
    public Employee createEmployee(EmployeeType employeeType, String fullName, double salary){
        switch (employeeType){
            case FIELD_TECHNICIAN:
                return new FieldTechnician(fullName, salary, EmployeeType.FIELD_TECHNICIAN);
            case MANAGER:
                return new Manager(fullName, salary, EmployeeType.MANAGER);
            case DISPATCHER:
                return new Dispatcher(fullName, salary, EmployeeType.DISPATCHER);
        }
        return null;
    }
}
