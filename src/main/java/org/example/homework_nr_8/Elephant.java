package org.example.homework_nr_8;

public class Elephant extends Herbivor implements Animal{

    String nam = "Elephant";
    int legs = 4;
    @Override
    public void breathe() {
        System.out.println("Elephant is breathing");;
    }

    @Override
    public void move() {
        System.out.println("Elephant is moving");
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    void swallow() {
        System.out.println("Elephant is swallowing");
    }
}
