package com.company;

public class Parrot extends Animal {
    public Parrot() {
        super("чырык-чырык");
    }

    @Override
    public void eat(String food) {
        voice();
    }
}