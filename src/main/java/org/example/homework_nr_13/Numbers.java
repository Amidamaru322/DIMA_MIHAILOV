package org.example.homework_nr_13;

public class Numbers {
    public static void main(String[] args) throws InvalidRangeException {
        System.out.println(DivisionBy(10, 2));

        try {
            int count = countDivisibleBy7Numbers(10, 0);
            System.out.println("Количество чисел, делящихся на 7: " + count);
        } catch (InvalidRangeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    public static int countDivisibleBy7Numbers(int InteriorLimit, int superiorLimit) throws InvalidRangeException {
        if (InteriorLimit > superiorLimit) {
            throw new InvalidRangeException("Некорректный диапазон чисел");
        }

        int count = 0;
        for (int i = InteriorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int DivisionBy(int x, int y) throws IllegalArgumentException {
        try {
            return x / y;
        } catch (IllegalArgumentException e) {
            return 0;
        } finally {
            System.out.println("The division was......");
        }
    }

    public static class InvalidRangeException extends Exception {
        public InvalidRangeException(String message) {
            super(message);
        }
    }
}
