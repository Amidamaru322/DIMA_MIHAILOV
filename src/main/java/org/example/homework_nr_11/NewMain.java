package org.example.homework_nr_11;

import java.util.function.Predicate;

public class NewMain {
    public static void main(String[] args) {
        Predicate<String> newBoolean = (String inputString) -> {
            inputString = inputString.replaceAll("\\s", "").toLowerCase();
            int left = 0;
            int right = inputString.length() - 1;
            while (left < right) {
                if (inputString.charAt(left) != inputString.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        };
        String str = "Anna";
        boolean isPalindrome = newBoolean.test(str);
        System.out.println("Строка \"" + str + "\" является палиндромом? " + isPalindrome);


    Predicate<Integer> devidedInteger = (Integer inputInteger) -> {
        if (inputInteger < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(inputInteger); i++) {
            if (inputInteger % i == 0) {
                return false;
            }
        }
        return true;
    };

    Integer testInteger = 11;
    boolean isSimpleNumber = devidedInteger.test(testInteger);
        System.out.println("Число: " + testInteger + " простое число: " + isSimpleNumber);
}
}
