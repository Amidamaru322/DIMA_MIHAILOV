package org.example.homework_nr_3;

public class TemperatureConverter {
        public static double toCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

        public static double toFahrenheit(double celsius) {
            return celsius * 9 / 5 + 32;
        }

        public static void main(String[] args) {
            TemperatureConverter tc = new TemperatureConverter();
            double fahrenheit = 100.0;
            double celsius = tc.toCelsius(fahrenheit);
            System.out.println(fahrenheit + " градусов Фаренгейта = " + celsius + " градусов Цельсия");

            celsius = 50.0;
            fahrenheit = tc.toFahrenheit(celsius);
            System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " градусов Фаренгейта");
        }
    }

