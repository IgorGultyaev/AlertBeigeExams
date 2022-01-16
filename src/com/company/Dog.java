package com.company;

public class Dog extends Animal {

    public Dog() {
        super("гав!");
    }

    @Override
    public void eat(String food) {
        if ("мясо".equals(food)) {
            System.out.println("Гав-гав-гав!");
        } else {
            System.out.println("Уууууу");
        }
    }
}