package org.example;

public class Car {
    private String model;
    private int topSpeed;

    public Car(String model, int topSpeed) {
        this.model = model;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
