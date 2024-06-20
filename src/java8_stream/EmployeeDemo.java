package java8_stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

    EmployeeDao employeeDao = new EmployeeDao();
    public static void main(String[] args) {
        EmployeeDemo demo = new EmployeeDemo();

        List<Employee> tax = demo.getTaxPayerEmployee("tax");
        List<Employee> employees = demo.sortEmployeeBasedOnSalary(tax);
        for (Employee e : employees) {
            System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary());
        }
    }

    public List<Employee> getTaxPayerEmployee(String arg) {

        return (arg.equalsIgnoreCase("non tax")) ? employeeDao.getAllEmployees().stream()
                .filter(employee -> employee.getSalary() >= 500000)
                .collect(Collectors.toList()) : employeeDao.getAllEmployees().stream()
                .filter(employee -> employee.getSalary() < 500000)
                .collect(Collectors.toList());

    }

    public List<Employee> sortEmployeeBasedOnSalary(List<Employee> list){

        return list.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .collect(Collectors.toList());
    }


}