package org.example.homework_nr_6;

public class MAIN {
    public static void main(String[] args) {

        Invoice netbook = new Invoice("asuszenbook", "hoolygan", 2, 10.0);
        System.out.println(netbook.getPrice());
        System.out.println(netbook.getAmount());




        Date newDate = new Date(29, 12, 1989);
        System.out.println();
        newDate.thisDate();
    }
}
