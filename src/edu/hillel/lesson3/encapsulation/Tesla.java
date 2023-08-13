package edu.hillel.lesson3.encapsulation;

import java.util.Random;

public class Tesla extends Car {

    private int speed;

    public Tesla() {
        autoPilot();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    private void autoPilot(){
        Random r = new Random();
        int minSpeed = 50;
        int maxSpeed = 300;
        speed = r.nextInt(maxSpeed - minSpeed) + minSpeed;
    }

}
