package org.example.homework_nr_7;

public class Main {
    public static void main(String... args) {
        Person person1 = new Person("alex", "Moldova");
        Staff staff1 = new Staff("Dima","Comrat", "№7", 2335.35);
        Student student1 = new Student("Vadim", "Moldova", "Bachelor", 7, 200.1);
        System.out.println(person1);
        System.out.println(staff1);
        System.out.println(student1);


    }
}