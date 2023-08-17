package edu.hillel.lesson5.abstraction;

import java.lang.reflect.Constructor;

public abstract class Car {

    public static int DEFAULT_SPEED = 60;

    public Car() {
        System.out.println("The current speed is "+ getSpeed()+ " km/h");
    }

    abstract int getSpeed();

}
