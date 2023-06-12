package org.example.homework_nr_13;

import javax.naming.InvalidNameException;

public class Person {

    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) throws InvalidNameException, InvalidAgeException {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws InvalidNameException {
        if (firstName == null || firstName.isEmpty()) {
            throw new InvalidNameException("Некорректное значение имени");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws InvalidNameException {
        if (lastName == null || lastName.isEmpty()) {
            throw new InvalidNameException("Некорреткное значение фамилии");
        }
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public void setAge(Integer age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Данное значеине не соответсвувет требованиям. Введите возраст от 0 до 150");
        }
        this.age = age;
    }
}
