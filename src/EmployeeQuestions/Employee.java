package EmployeeQuestions;

public class Employee {
    private int id ;
    private String name;
    private String dept;
    private long salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getDept() {
        return dept;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }


}
