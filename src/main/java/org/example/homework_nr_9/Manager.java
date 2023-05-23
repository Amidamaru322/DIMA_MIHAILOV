package org.example.homework_nr_9;

public class Manager extends Employee implements AttenTraining, Interview{

    Integer teamSize;

    public Manager(String name, String surname, Integer age, Integer teamSize) {
        super(name, surname, age);
        this.teamSize = teamSize;
    }


    @Override
    public void conductInterview() {
        System.out.println("Manager is taking Interview");
    }

    @Override
    public void conductTraining() {
        System.out.println("Manager is training something");
    }
}
