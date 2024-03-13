package org.example;

import org.example.generics.CarPair;
import org.example.generics.DriveableAndSellableVehiclePair;
import org.example.generics.DriveableVehiclePair;
import org.example.generics.Pair;
import org.example.generics.VehiclePair;
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
        //inheritanceAndInterfaces();
        //statics();
        generics();


    }

    private static void generics() {
        Pair<String, Integer> firstPair = new Pair<>("Sun", 2);
        Pair<String, String> secondPair = new Pair<>("Sun", "Seeker");
        System.out.println(firstPair.getValue1() + " - " + firstPair.getValue2());
        System.out.println(secondPair.getValue1() + " - " + secondPair.getValue2());

        PersonalCar audiRS6 = new PersonalCar("Audi", "RS6", 2022);
        Car audiA4 = new PersonalCar("Audi", "A4", 2022);

        Airplane boeing747 = new Airplane("Boeing", "747", 2010);

        Pair<Car, Integer> pairOne = new Pair<>(audiRS6, 200);
        Pair<PersonalCar, Integer> paineTwo = new Pair<>(audiRS6, 200);


        VehiclePair<Car, Integer> vehiclePairOne = new VehiclePair<>(audiA4, 200);
        VehiclePair<Airplane, Integer> vehiclePairTwo = new VehiclePair<>(boeing747, 200);

        CarPair<Car, String> carPairOne = new CarPair<>(audiA4, "Sold");
        CarPair<PersonalCar, String> carPairTwo = new CarPair<>(audiRS6, "For sale");

        DriveableVehiclePair<PersonalCar, String> driveableVehiclePairOne= new DriveableVehiclePair<>(audiRS6, "Driveable!");

        DriveableAndSellableVehiclePair<PersonalCar, String> driveAndSellAbleVehiclePairOne = new DriveableAndSellableVehiclePair<>(audiRS6, "DriveAndSellable");

    }


    private static void statics() {
        Cake chocoCake = new Cake("Chocolate");
        Cake appleCake = new Cake("Apple");
        System.out.println(Cake.getCount());
    }

    private static void inheritanceAndInterfaces() {
        Vehicle airplane = new Airplane("Boeing", "747", 2011);
        Car personalCar = getCarBasedOnVIN("KJSLADJDKLSA");
        Taxi taxiCar = new Taxi("Mercedes", "EQC", 2022);
        Bike bike = new Bike("DBS", "SpeedPro", 2020);

        sellToDealer(taxiCar);
    }

    private static Car getCarBasedOnVIN(String kjsladjdklsa) {
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
