package user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Builder pattern
 * @see account.BankAccount
 */

@Builder //nie zadzialą jak robimy employee extends...
@Getter
@Setter
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String position;

}
