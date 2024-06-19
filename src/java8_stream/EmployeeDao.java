package java8_stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeDao {

    public List<Employee> getAllEmployees(){
        return Arrays.asList(
                new Employee(101, "Ram", 500000),
                new Employee(102, "Sita", 700000),
                new Employee(103, "Ravan", 900000),
                new Employee(104, "Rohan", 1200000),
                new Employee(105, "Bali", 300000),
                new Employee(106, "Sugriv", 400000)
        );
    }
}
