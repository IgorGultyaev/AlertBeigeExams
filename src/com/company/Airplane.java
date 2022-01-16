package com.company;

public class Airplane extends AirVehicle {


    @Override
    public void transferFly(Object obj) {
        System.out.println("Самолет перемещает  объект " + obj);
    }

    @Override
    public void fly() {
        System.out.println("Прогрелись - полетели");
    }
}