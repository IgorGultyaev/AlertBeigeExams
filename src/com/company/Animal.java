package com.company;

public abstract class Animal {
    private String voice;

    public Animal(String voice) {
        this.voice = voice;
    }

    public void voice() {
        System.out.println(voice);
    }

    public abstract void eat(String food);


}