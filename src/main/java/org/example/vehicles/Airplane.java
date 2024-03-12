package org.example.vehicles;

import org.example.interfaces.financial.Buyable;
import org.example.interfaces.financial.PrivatelySellable;
import org.example.interfaces.movement.Flyable;

public class Airplane extends Vehicle implements Flyable, Buyable, PrivatelySellable {

    public Airplane(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void TakeOf() {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return make + " " + model;
    }
}
