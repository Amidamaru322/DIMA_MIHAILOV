package org.example.homework_nr_8;

public interface Animal {
    String name = null;
    Integer legs = null;

    default void breathe(){
        System.out.println("Animal is breathing");
    }
   static void type(){
       System.out.println("This is Animal");
   };
    void move();
    void eat();

}
