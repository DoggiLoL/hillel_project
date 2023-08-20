package edu.hillel.lesson4.HomeWork4;

public class Cat extends Animal{

    private static int catCounter;

    public Cat(){
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    protected int maxCatDistanceRun = 200;
    protected int getMaxCatDistanceSwim = 0;

    @Override
    void Run(int distance) {
        if(distance <= maxCatDistanceRun){
            System.out.println(name + " пробежал " + distance + "метров.");
        } else {
            System.out.println(name + " пробежал " + maxCatDistanceRun + "метров.");
        }
    }

    @Override
    void Swim(int distance) {
        System.out.println(name + " проплыл " + getMaxCatDistanceSwim + "метров.");
    }
}

