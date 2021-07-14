package com.imutable;

public class Engine {
    private double horsPower;
    private double weight;
    private double mileage;

    public Engine() {

    }

    public double getHorsPower() {
        return horsPower;
    }

    public double getWeight() {
        return weight;
    }

    public double getMileage() {
        return mileage;
    }

    public void setHorsPower(double horsPower) {
        this.horsPower = horsPower;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Engine copyEngine() {
        Engine engine = new Engine();
        engine.setHorsPower(this.getHorsPower());
        engine.setWeight(this.getWeight());
        engine.setMileage(this.getMileage());
        return engine;
    }
}




