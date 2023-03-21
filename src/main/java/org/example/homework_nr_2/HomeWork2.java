package org.example.homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args){
        int month = 3;
        switch (month){
            case 1:  System.out.println("Январь");
            break;
            case 2:  System.out.println("Февраль");
                break;
            case 3:  System.out.println("Март");
                break;
            case 4:  System.out.println("Апрель");
                break;
            case 5:  System.out.println("Май");
                break;
            case 6:  System.out.println("Июнь");
                break;
            case 7:  System.out.println("Июль");
                break;
            case 8:  System.out.println("Август");
                break;
            case 9:  System.out.println("Сентябрь");
                break;
            case 10:  System.out.println("Октябрь");
                break;
            case 11:  System.out.println("Ноябрь");
                break;
            case 12:  System.out.println("Декабрь");
                break;
            default:  System.out.println("default");
                break;
        }

        for(int index = 100; index <=1001 ; index++){
            if (index % 5 == 0) {
            System.out.println(index);
        }
    }
        char star = '*';
        while (star <='******') {
            if (star + '*' == 0) {
                System.out.println(star);
            }
            star++;
        }
}}
