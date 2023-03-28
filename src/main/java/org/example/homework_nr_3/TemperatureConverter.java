package org.example.homework_nr_3;

public class TemperatureConverter {
    double fahrenheit;
    double celsius;

    public TemperatureConverter(double fahrenheit, double celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }

    public double toCelsius() {
            return (fahrenheit - 32) * 5 / 9;
        }

        public double toFahrenheit() {
            return celsius * 9 / 5 + 32;
        }

        public static void main(String[] args) {
            TemperatureConverter tc = new TemperatureConverter(100, 50 );
            double cel = tc.toCelsius();
            double fah = tc.toFahrenheit();
            System.out.println(cel);
            System.out.println(fah);
        }
    }