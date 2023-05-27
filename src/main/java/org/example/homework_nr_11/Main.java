package org.example.homework_nr_11;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        //Принять строку и вернуть количество согласных букв
        Function<String, Integer> getConsonantCount = input -> {
            int count = 0;
            input = input.toLowerCase();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (!isVowel(c)){
                    count++;
                }
            }
            return count;
        };
        String newString = "New string";
        int quantityConsonats = getConsonantCount.apply(newString);
        System.out.println("Quantity of Consonant Count: " + quantityConsonats);
        System.out.println("______________________________________________");

        //Принять строку и вернуть количество гласных букв
        Function<String, Integer> getvowelLetters = input -> {
            int count = 0;
            input = input.toLowerCase();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (isVowel(c)) {
                    count++;
                }
            }
            return count;
        };

        String newString2 = "New string";
        int quantityVowels = getvowelLetters.apply(newString2);
        System.out.println("Quantity of Vowels Count: " + quantityVowels);
        System.out.println("______________________________________________");

        //Принять строку и вернуть количество чисел внутри строки
        Function<String, Integer> getNumberCount = input -> {
            int count = 0;
            boolean isNumber = false;
            for (int i = 0; i < input.length(); i++){
                char c = input.charAt(i);
                if (Character.isDigit(c)) {
                    if (!isNumber) {
                        count++;
                        isNumber = true;
                    }
                } else {
                    isNumber = false;
                }
            }
            return count;
        };
        String inputString = "There are 5 apples and 3 oranges";
        int numberCount = getNumberCount.apply(inputString);
        System.out.println("Number Count: " + numberCount);
        System.out.println("______________________________________________");

        //Принять строку и вернуть null если количество элементов строки четное,
        //вернуть первый символ строки если количество элементов строки нечетное
        Function<String, Character> getElementCount = input -> {
           if (input.length() % 2 == 0){
               return null;
           } else {
               return input.charAt(0);
           }
        };

        String newString4 = "Hello1";
        Character result = getElementCount.apply(newString4);
        System.out.println("Result is : " + result);

    }
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }

}