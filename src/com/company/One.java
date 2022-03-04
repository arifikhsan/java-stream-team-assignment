package com.company;

// 1. Using create an Interface and using a Lambda expression
public class One {
    public static void main(String[] args) {
        greet("Morning", System.out::println);
        greet("Afternoon", System.out::println);
        greet("Night", System.out::println);
    }

    private static void greet(String day, GreetingInterface greeting) {
        greeting.sayGood(day);
    }
}

interface GreetingInterface {
    void sayGood(String day);
}
