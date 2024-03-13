package org.example.generics;

import org.example.vehicles.Car;

// Upper bounded
public class CarPair<T1 extends Car,T2> {

    private T1 value1;
    private T2 value2;

    public CarPair(T1 value1, T2 value2) {
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
