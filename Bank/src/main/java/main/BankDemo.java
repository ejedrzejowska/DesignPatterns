package main;

import account.AccountService;
import user.Employee;
import user.User;
import user.UserRepository;

public class BankDemo {
    public static void main(String[] args) {
        UserRepository userRepository = UserRepository.getInstance();
        AccountService accountService = new AccountService();
        User u1 = userRepository.getUsers().get("Bob Badura");
        accountService.deposit(u1.getBankAccount(), 200);

//        Employee employee = Employee.builder() ---> Automatyczny builder z lomboka @Builder <---
//                .firstName("Ewa")
//                .lastName("Nowak")
//                .salary(5000)
//                .build();

    }
}
