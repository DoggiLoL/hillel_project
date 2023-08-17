package edu.hillel.lesson5.abstraction;

public class Daewoo extends Car {
    @Override
    int getSpeed() {
        return Car.DEFAULT_SPEED;
    }
}
