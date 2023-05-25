package org.example.homework_nr_10;

import java.util.*;

public class Main {
    public static <Sting> void main(String[] args) {
        List<String> Tasks = getTasks();
        System.out.println(Tasks);
        System.out.println("__________________");


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        list.add("b");
        // Set with unique elements
        Set<String> uniqueElements = new HashSet<>(list);

        for (String element :
                uniqueElements) {
            System.out.println(element);
        }
        System.out.println("__________________");

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("cat", "pisica");
        dictionary.put("book", "carte");
        dictionary.put("apple", "mar");
        dictionary.put("pen", "pix");
        dictionary.put("tree", "copac");
        dictionary.put("sun", "soare");
        dictionary.put("brother", "frate");
        dictionary.put("school", "școală");
        dictionary.put("house", "casă");
        dictionary.put("teacher", "profesor");

        for (Map.Entry<String, String> element: dictionary.entrySet()) {
            String word = element.getKey();
            String translation = element.getValue();
            System.out.println(word + " - " + translation);
        }
        System.out.println("__________________");

        Deque<String> fiveElementDeque = new ArrayDeque<>();
        fiveElementDeque.push("first");
        fiveElementDeque.push("second");
        fiveElementDeque.push("third");
        fiveElementDeque.push("fourth");
        fiveElementDeque.push("fifth");

        for (int i = 0; i < 3; i++) {
            String element = fiveElementDeque.pop();
            System.out.println("Извлечен элемент: " + element);
        }
        Sting nextElement = (Sting) fiveElementDeque.peek();
        System.out.println("Следующий элемент в очереди: "+ nextElement);
    }

    public static List<String> getTasks() {
        List<String> tasksList = new ArrayList<>();
        tasksList.add("Wake up");
        tasksList.add("Do household chores");
        tasksList.add("Work harder");
        tasksList.add("Java lessons");
        tasksList.add("Java Homework");
        tasksList.add("Another work");
        tasksList.add("Sleep");
        return tasksList;
    }
}