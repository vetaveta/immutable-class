package com.imutable;

public class Engine {
    private int horsPower;
    private double weight;
    private double mileage;

    public Engine(int horsPower, double weight, double mileage) {
        this.horsPower = horsPower;
        this.weight = weight;
        this.mileage = mileage;
    }

    public int getHorsPower() {
        return horsPower;
    }

    public double getWeight() {
        return weight;
    }

    public double getMileage() {
        return mileage;
    }

    public void setHorsPower(int horsPower) {
        this.horsPower = horsPower;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
