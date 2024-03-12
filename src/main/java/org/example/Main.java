package org.example;

import org.example.interfaces.financial.DealerSellable;
import org.example.interfaces.financial.PrivatelySellable;
import org.example.interfaces.financial.Sellable;
import org.example.statics.Cake;
import org.example.vehicles.Airplane;
import org.example.vehicles.Bike;
import org.example.vehicles.Car;
import org.example.vehicles.PersonalCar;
import org.example.vehicles.Taxi;
import org.example.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane("Boeing", "747", 2011);
        Car personalCar = GetCarBasedOnVIN("KJSLADJDKLSA");
        Car taxiCar = new Taxi("Mercedes", "EQC", 2022);
        Bike bike = new Bike("DBS", "SpeedPro", 2020);

        Cake choco = new Cake("Chocolate");
        Cake apple = new Cake("Apple");

        System.out.println(Cake.getCount());

    }

    private static Car GetCarBasedOnVIN(String kjsladjdklsa) {
        return new PersonalCar("Nissan", "Micra", 1997);
    }


    private static void sellToAnyone(Sellable sa) {
        if(sa instanceof PrivatelySellable) {
            sellToPrivatePerson((PrivatelySellable) sa);
        } else if(sa instanceof DealerSellable) {
            sellToDealer((DealerSellable) sa);
        } else {
            System.out.println("IMPLEMENTING SELLABLE DIRECLTY, PLEASE USE A SUB INTERFACE");
        }
    }


    private static void sellToPrivatePerson(PrivatelySellable ps) {
        System.out.println("Sold " + ps.getName() + " to private");
    }

    private static void sellToDealer(DealerSellable ds) {
        System.out.println("Sold " + ds.getName() + " to dealer");
    }
}
