package edu.hillel.Lesson16.Home_Work16;

public class Main {
    public static void main(String[] args) {
        PatrolStation station = new PatrolStation(100);

        ThreadSafeList<Thread> threads = new ThreadSafeList<>();

        for (Thread thread : threads.get()){
            try{
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
