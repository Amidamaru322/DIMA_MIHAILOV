package org.example.homework_nr_7.shape;

public class Square extends TwoDimensionalShape{
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length*length;
    }
}
