package com.company;

public abstract class AirVehicle implements AirTransferer, Flyable {

    public abstract void transferFly(Object obj);

    public void land() {
        System.out.println("Фух, сели!");
    }

}