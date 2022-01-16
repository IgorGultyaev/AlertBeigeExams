package com.company;

public class Dragon extends Animal implements AirTransferer, Flyable {

    public Dragon() {
        super("Ииииииииу!");
    }

    @Override
    public void eat(String food) {
        if ("мясо".equals(food)) {
            System.out.println("Ииииииу!");
        } else {
            System.out.println("Я тебя сейчас съем, а не " + food);
        }
    }

    @Override
    public void transferFly(Object obj) {
        System.out.println("Дракон перемещает объект " +  obj);
    }

    @Override
    public void fly() {
        voice();
    }

    @Override
    public void land() {
        System.out.println("Ням-ням!");
    }


}