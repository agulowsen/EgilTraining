package org.example.vehicles;

import org.example.interfaces.movement.Submersible;

public class Submarine extends Vehicle implements Submersible {

    public Submarine(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void closeHatch() {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }
}
