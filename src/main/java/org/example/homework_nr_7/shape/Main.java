package org.example.homework_nr_7.shape;

public class Main {

    public static void main(String[] args) {
        TwoDimensionalShape circle = new Circle(4);
        TwoDimensionalShape square = new Square(4);
        ThreeDimensionalShape cube = new Cube(3);
        ThreeDimensionalShape sphere = new Sphere(5);

        System.out.println("Area of Circle = "+ circle.calculateArea());
        System.out.println("Area of Square = "+ square.calculateArea());
        System.out.println("Area of Cube = "+ cube.calculateArea1());
        System.out.println("Area of Sphere = "+ sphere.calculateArea1());

    }
}
