package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        int howMany;
        System.out.print("How many employees will be registered? ");
        howMany = sc.nextInt();

        for (int i = 0; i < howMany; i++) {
            System.out.printf("Employee #%d:%n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        Integer pos = Employee.idPosition(list, idIncrease);

        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).addSalary(percentage);
        }

        System.out.println("List of employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }
}
