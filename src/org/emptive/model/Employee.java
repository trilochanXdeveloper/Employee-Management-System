package org.emptive.model;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private String department;

    public Employee(int empId, String empName, double salary, String department){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpId(){
        return empId;
    }

    public String getEmpName(){
        return empName;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
