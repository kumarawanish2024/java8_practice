package java8_stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

    public static void main(String[] args) {
        EmployeeDemo demo = new EmployeeDemo();
        System.out.println();

        List<Employee> tax = demo.getTaxPayerEmployee("tax");
        for (Employee e : tax) {
            System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary());
        }


    }

    public List<Employee> getTaxPayerEmployee(String arg) {
        EmployeeDao employeeDao = new EmployeeDao();

        return (arg.equalsIgnoreCase("tax")) ? employeeDao.getAllEmployees().stream()
                .filter(employee -> employee.getSalary() >= 500000)
                .collect(Collectors.toList()) : employeeDao.getAllEmployees().stream()
                .filter(employee -> employee.getSalary() < 500000)
                .collect(Collectors.toList());

    }
}
