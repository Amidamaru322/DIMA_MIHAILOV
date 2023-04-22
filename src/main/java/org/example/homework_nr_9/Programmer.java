package org.example.homework_nr_9;

public class Programmer extends Employee implements Training {

    String programmingLanguage;

    public Programmer(String name, String surname, Integer age, String programmingLanguage) {
        super(name, surname, age);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void conductTraining() {
        System.out.println("Programmer is teaching something");
    }
}
