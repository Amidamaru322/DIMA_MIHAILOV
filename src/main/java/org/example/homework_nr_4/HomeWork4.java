package org.example.homework_nr_4;

public class HomeWork4 {
    public static void main(String... args) {
        int[] array = new int[]{1, 2, 3, 4};

        for (int index = 0; index != array.length; index++) {
            System.out.println(array[index]);
        }


        System.out.println("=====================");

        int[][] secondary = new int[][]{
                {1, 2, 3, 4, 3},
                {5, 6, 7, 8}
        };
        int count = 0;
        for (int x = 0; x != secondary.length; x++) {
            for (int y = 0; y != secondary[x].length; y++) {
                if (secondary[x][y] % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println("Нечетные числа =" + count);
        System.out.println("=====================");
        int count1 = 0;
        for (int x = 0; x != secondary.length; x++) {
            for (int y = 0; y != secondary[x].length; y++) {
                if (secondary[x][y] % 2 == 0) {
                    count1++;
                }
            }
        }
        System.out.println("Четные числа =" + count1);
        System.out.println("=====================");
        int count2 = 0;
        for (int x = 0; x != array.length; x++)
                count2 += array[x];
        double count3 = count2/array.length;

         System.out.println("Сумма всех элементов одномерного массива =" + count2);
        System.out.println("=====================");
        System.out.println("Среднее значиение всех элементов одномерного массива =" + count3);
        }
}


