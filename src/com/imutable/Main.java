package com.imutable;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(380, 2217, 77);
        Car car = new Car(1958, "linkoln", "continental", engine);
        System.out.println(car.getEngine().getHorsPower());
        engine.setHorsPower(350);
        System.out.println(car.getEngine().getHorsPower());
    }
}
