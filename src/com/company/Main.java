package com.company;

class Main {
    public static void main(String[] args) {

        System.out.println(AirTransferer.SIZE);
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Мурка");
        animals[1] = new Dog();
        animals[2] = new Parrot();

        giveFood("яйцо", animals);

        AirTransferer[] airTransfererObjs = new AirTransferer[4];
        airTransfererObjs[0] = new Airplane();
        airTransfererObjs[1] = new Helicopter();
        airTransfererObjs[2] = new Airplane();
        airTransfererObjs[3] = new Dragon();

        Cat vasya = new Cat("Васька");

        transferObjectByDifferentWays(airTransfererObjs, vasya);


    }

    private static void giveFood(String food, Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat(food);
        }
    }

    private static void transferObjectByDifferentWays(AirTransferer[] airTransfererObjects, Object obj) {
        for (AirTransferer airTransfererObject : airTransfererObjects) {
            airTransfererObject.transferFly(obj);
        }
    }
}