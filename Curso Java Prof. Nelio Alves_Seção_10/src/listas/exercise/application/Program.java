package listas.exercise.application;

import listas.exercise.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salario = sc.nextDouble();

            Employee emp = new Employee(id, name, salario);

            employees.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idsalario = sc.nextInt();

        Employee employee = employees.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);

        if(employee == null){
        System.out.println("This id does not exist!");
    } else {
            System.out.print("Enter the percentage: ");
            Double percent = sc.nextDouble();
            employee.aumentoSalario(percent);
        }


        //Forma de resolver sem usar função lambda
//         Integer pos = position(employees, idsalario);
//        if(pos == null){
//            System.out.println("This id does not exist!");
//        } else {
//            System.out.print("Enter the percentage: ");
//            Double percent = sc.nextDouble();
//            employees.get(pos).aumentoSalario(percent);
//        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        sc.close();
    }

    //Por estar no main static, a função tem quer ser estática também
    public static Integer position(List<Employee> list, int id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
