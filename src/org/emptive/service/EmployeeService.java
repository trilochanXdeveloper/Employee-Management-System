package org.emptive.service;

import org.emptive.exception.EmployeeNotFoundException;
import org.emptive.model.Employee;
import java.util.*;

public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            throw new EmployeeNotFoundException("No employees available");
        }

        for (Employee emp : employees) {
            System.out.println("Employee " + Arrays.stream(emp.getEmpName().split(" ")).findFirst().get() + "'s details");
            System.out.println("Id : " + emp.getEmpId() + "\n" +
                    "Name : " + emp.getEmpName() + "\n" +
                    "Salary : " + emp.getSalary() + "\n" +
                    "Department : " + emp.getDepartment() + "\n"
            );
        }
    }

    public void searchEmployeeById(int empId) {
        Employee emp = employees.stream()
                .filter(employee -> employee.getEmpId() == empId)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found"));

        System.out.println("Id : " + emp.getEmpId() + "\n" +
                "Name : " + emp.getEmpName() + "\n" +
                "Salary : " + emp.getSalary() + "\n" +
                "Department : " + emp.getDepartment() + "\n"
        );
    }

    public void updateEmployee(int empId, double newSalary, String newDept){
        boolean found = false;
        for(Employee emp : employees){
            if (emp.getEmpId() == empId){
                emp.setSalary(newSalary);
                emp.setDepartment(newDept);
                found = true;
                break;
            }
        }
        if (!found){
            throw new EmployeeNotFoundException("Employee not found");
        }
    }

    public void deleteEmployee(int empId){
        Iterator<Employee> itr = employees.iterator();
        boolean found = false;

        while (itr.hasNext()){
            Employee emp = itr.next();
            if (emp.getEmpId()==empId){
                itr.remove();
                found=true;
                break;
            }
        }
        if (!found){
            throw new EmployeeNotFoundException("Employee not found");
        }
    }




}
