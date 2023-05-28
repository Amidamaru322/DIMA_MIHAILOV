package org.example.homework_nr_12;

import javafx.scene.SubScene;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex", "Smirnov", 34, true, true));
        employees.add(new Employee("Dima", "Mihailov", 23, false, true));
        employees.add(new Employee("Vadim", "Peev", 44, false, false));
        employees.add(new Employee("Mihail", "Cheban", 27, true, true));
        employees.add(new Employee("Alex", "Palac", 41, false, true));
        employees.add(new Employee("Mihail", "Const", 29, true, false));
        employees.add(new Employee("Anna", "Gagauz", 31, false, false));
        employees.add(new Employee("Vasili", "Arnaut", 25, false, false));
        employees.add(new Employee("Anastasia", "Capacli", 34, true, true));
        employees.add(new Employee("Olga", "Fedorova", 53, true, false));


        employees.stream()
                .filter(employee -> employee.getAge() > 25)
                .filter(employee -> employee.isPayedByHour)
                .filter(employee -> employee.canConductInterview)
                .map(Employee::toString)
                .forEach(System.out::println);
        System.out.println("_______________________________________");
        employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .filter(employee -> !employee.isPayedByHour)
                .map(Employee::getName)
                .sorted()
                .forEach(System.out::println);
        System.out.println("_______________________________________");

        Optional<Employee> optionalEmployee = employees.stream()
                .filter(employee -> employee.canConductInterview)
                .filter(employee -> employee.isPayedByHour)
                .findFirst();
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            System.out.println(employee.toString());
        } else {
            System.out.println("Employee was not found!");
        }
        System.out.println("_______________________________________");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .forEach(System.out::println);


    }

}

