package EmployeeQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestPaidEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList= Stream.of(
                new Employee(1,"abc","testing",50000),
                new Employee(2,"def","dev",60000),
                new Employee(3,"ghi","dev",40000),
                new Employee(4,"ksa","testing",90000),
                new Employee(5,"wgv","cashier",70000),
                new Employee(6,"pis","cashier",80000)

        ).toList();

    Map<String,List<Employee>> group =employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(group);

    Map<String ,Employee> employeeList1= employeeList.stream().
            collect(Collectors.groupingBy(
                    Employee::getDept,
                    Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),Optional::get)
                    )

            );
        System.out.println(employeeList1);
    }
}
