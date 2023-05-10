package org.example.homework_nr_7.shape;

public class Sphere extends ThreeDimensionalShape{

    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea1() {
        return Math.PI * 4 * (radius*radius);
    }
}
