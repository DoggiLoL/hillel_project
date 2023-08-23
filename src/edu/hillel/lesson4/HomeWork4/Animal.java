package edu.hillel.lesson4.HomeWork4;

abstract class Animal {

    private static int animalCounter;
    public  Animal(){
        animalCounter++;
        this.name = name;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    protected String name;

    public void setName(String name) {

        this.name = name;
    }

    abstract void Run(int distance);

    abstract void Swim(int distance);
}



