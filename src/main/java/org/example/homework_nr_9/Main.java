package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee manager1 = new Manager("Alex", "Ciobanu", 43, 20);
        Employee manager2 = new Manager("Dima", "Vox", 23, 5);
        Employee programmer1 = new Programmer("Vadim", "Peev", 31, "Java");
        Employee programmer2 = new Programmer("Mihail", "Cioban", 24, "Python");

        List<Employee> AttenTraining = new ArrayList<>();
        AttenTraining.add(manager1);
        AttenTraining.add(manager2);
        AttenTraining.add(programmer1);
        AttenTraining.add(programmer2);


        for (Employee element:
             AttenTraining) {
            System.out.println("Attendee: " + element.getName() + " " + element.getSurname());
        }
    }
}
