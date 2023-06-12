package org.example.homework_nr_13;

import javax.naming.InvalidNameException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Alex", "Deer", 32);
            Person person2 = new Person("Vadim", "Peev", 21);
            Person person3 = new Person("Alex", "Vox", 19);

        } catch (Person.InvalidAgeException e) {
            System.out.println("Ошибка в имени " + e.getMessage());
        } catch (InvalidNameException e) {
            System.out.println("Ошибка в возрасте " + e.getMessage());
        }
    }
}
