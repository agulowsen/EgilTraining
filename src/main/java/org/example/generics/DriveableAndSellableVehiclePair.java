package org.example.generics;

import org.example.interfaces.financial.Sellable;
import org.example.interfaces.movement.Driveable;
import org.example.vehicles.Vehicle;

// Upper bounded
public class DriveableAndSellableVehiclePair<T1 extends Vehicle & Driveable & Sellable,T2> {

    private T1 value1;
    private T2 value2;

    public DriveableAndSellableVehiclePair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }
}
