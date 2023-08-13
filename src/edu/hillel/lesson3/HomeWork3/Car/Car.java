package edu.hillel.lesson3.HomeWork3.Car;

public class Car {
    private static void startElectricity(){
        System.out.println("Start Electricity.");
    }
    private static void startCommand(){
        System.out.println("Start Command.");
    }


    private static void startFuelSystem(){
        System.out.println("Start Fuel System");
    }

    public static void Start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
