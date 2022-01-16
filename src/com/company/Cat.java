package com.company;

public class Cat extends Animal {

    private String name;

    public Cat(String name) {
        super("мяу!");
        this.name = name;
    }

    @Override
    public void eat(String food) {
        if ("яйцо".equals(food)) {
            System.out.println("Мрррр, мяу!");
        } else {
            System.out.println("Меееее!");
        }
    }

    @Override
    public String toString() {
        return "Кошка " + name;
    }
}