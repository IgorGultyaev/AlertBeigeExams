package com.company;

public class Helicopter extends AirVehicle {


    @Override
    public void transferFly(Object obj) {
        System.out.println("Вертолет перемещает  объект " + obj);
    }

    @Override
    public void fly() {
        System.out.println("Вртттт - это вертолет!");
    }
}