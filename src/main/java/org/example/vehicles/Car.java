package org.example.vehicles;

import org.example.interfaces.movement.Driveable;

public abstract class Car extends Vehicle implements Driveable {

    private int amountOfwheels;

    public Car(String make, String model, int year) {
        super(make, model, year);
    }


    @Override
    public void moveRight() {
        System.out.println("MOVE RIGHT");
    }

    @Override
    public void moveLeft() {
        // Code that moves left
    }

    public int getAmoutnWheels() {
        return amountOfwheels;
    }
}
