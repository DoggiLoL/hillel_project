package edu.hillel.Lesson16.Home_Work16;

import java.util.concurrent.locks.ReentrantLock;

public class PatrolStation {
    private int amount;
    private ReentrantLock refuelLock = new ReentrantLock();

    public PatrolStation(int initialAmount) {
        this.amount = initialAmount;
    }

    public void doRefuel(int fuelAmount){
        if(fuelAmount <= 0){
            throw new IllegalArgumentException("Fuel amount must be greater than 0");
        }
        refuelLock.lock();
        try{
            if (amount < fuelAmount){
                System.out.println("Not enough fuel available for refueling.");
            } else {
                int refuelTime = (int) (Math.random() * 8) + 3;
                System.out.println("Redueling for" + refuelTime + " seconds...");
                try{
                    Thread.sleep(refuelTime * 1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }

                amount -= fuelAmount;
                System.out.println("Refueling completed. Remaining fuel: " + amount);
            }
        } finally {
            refuelLock.unlock();
        }
    }
}
