package edu.hillel.lesson4.HomeWork4;
import java.util.Scanner;
public class Dog extends Animal{

    private static int dogCounter;

    public Dog(String name){
        dogCounter++;
        this.name = name;
    }

    public static int getDogCounter() {
        return dogCounter;
    }

    protected int maxDogDistanceRun = 500;
    protected int maxDogDistanceSwim = 10;

    @Override
    void Run(int distance) {
        if(distance <= maxDogDistanceRun){
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " пробежал " + maxDogDistanceRun + " метров.");
        }
    }

    @Override
    void Swim(int distance) {
        if(distance <= maxDogDistanceRun){
            System.out.println(name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(name + " проплыл " + maxDogDistanceSwim + " метров.");
        }
    }
}
