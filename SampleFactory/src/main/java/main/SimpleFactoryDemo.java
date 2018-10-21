package main;

import employee.*;
import employee.factory.EmployeeFactory;
import employee.factorymethod.DispatcherFactoryMethodFactory;
import employee.factorymethod.EmployeeFactoryMethodFactory;
import employee.factorymethod.FieldTechnicianFactoryMethodFactory;
import employee.factorymethod.ManagerFactoryMethodFactory;

public class SimpleFactoryDemo {

    public static void main(String[] args) {


        Employee fieldTechnician = new FieldTechnician("Jan Kowalski", 2000.0, EmployeeType.FIELD_TECHNICIAN);
        Employee dispatcher = new Dispatcher("Adam Nowak", 3500.0, EmployeeType.DISPATCHER);
        Employee manager = new Manager("Anna Kowal", 5600.0, EmployeeType.MANAGER);

        System.out.println(fieldTechnician.showEmployeeDetails());
        System.out.println(dispatcher.showEmployeeDetails());
        System.out.println(manager.showEmployeeDetails());

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee managerOne = employeeFactory.createEmployee(EmployeeType.MANAGER, "Adam Nowakowski", 4500);
        System.out.println(managerOne.showEmployeeDetails());

        EmployeeFactoryMethodFactory fieldTechnicianFactory = new FieldTechnicianFactoryMethodFactory();
        fieldTechnicianFactory.createEmployee(2000, "Jan Kowalski");

        EmployeeFactoryMethodFactory dispatcherFactory = new DispatcherFactoryMethodFactory();
        dispatcherFactory.createEmployee(2500, "Adam Nowak");

        EmployeeFactoryMethodFactory managerFactory = new ManagerFactoryMethodFactory();
        managerFactory.createEmployee(5000, "Anna Jóźwik");

    }
}
