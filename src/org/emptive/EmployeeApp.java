package org.emptive;

import org.emptive.exception.EmployeeNotFoundException;
import org.emptive.model.Employee;
import org.emptive.service.EmployeeService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        System.out.println("----- Employee Details -----");
        while (true) {
            System.out.println("Options:");
            System.out.println("\n1.Add");
            System.out.println("2.View");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.println("6.Exit");
            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        System.out.println("Enter Id : ");
                        int empId = Integer.parseInt(sc.nextLine());
                        sc.nextLine();
                        System.out.println("Enter Name: ");
                        String empName = sc.nextLine();
                        System.out.println("Enter salary: ");
                        double empSalray = Double.parseDouble(sc.nextLine());
                        System.out.println("Enter Department: ");
                        String empDept = sc.nextLine();
                        service.addEmployee(new Employee(empId, empName, empSalray, empDept));
                        break;

                    case 2:
                        System.out.println();
                        service.viewEmployees();
                        break;

                    case 3:
                        System.out.println("Enter Employee ID: ");
                        service.searchEmployeeById(Integer.parseInt(sc.nextLine()));
                        break;

                    case 4:
                        System.out.println("Enter Employee ID: ");
                        int employeeId = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter new salary: ");
                        double newSalary = Double.parseDouble(sc.nextLine());
                        System.out.println("Enter new Department: ");
                        String newDept = sc.nextLine();
                        service.updateEmployee(employeeId, newSalary,newDept);
                        break;

                    case 5:
                        System.out.println("Enter Employee ID: ");
                        service.deleteEmployee(Integer.parseInt(sc.nextLine()));
                        System.out.println("Employee Deleted");
                        break;
                    case 6:
                        System.exit(0);
                        System.out.println("See You Again !!!");
                    default:
                        throw new InputMismatchException("Invalid Input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");

            } catch (EmployeeNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
