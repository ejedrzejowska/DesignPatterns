package employee.factorymethod;

import employee.Employee;

public abstract class EmployeeFactoryMethodFactory {
    public abstract Employee createEmployee(double salary, String fullName);
    public String getSomeInformation(){
        return "Basic Employee";
    }

}
