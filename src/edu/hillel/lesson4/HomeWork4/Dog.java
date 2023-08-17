package edu.hillel.lesson4.HomeWork4;
import java.util.Scanner;
public class Dog extends Animal{
static Scanner scan = new Scanner(System.in);
    private final int maxRun = 500;



    private int maxSwim = 10;
    public static void Run(int maxRun){
        int runLength= scan.nextInt();
        if(runLength > maxRun){
            System.out.println("Собака не может пробежать - "+ runLength + " м." +"\n"+ "Максимальная длина бега - " + maxRun + " м.");
        }else {
            System.out.println("Cобака пробежала - " + runLength + " м.");
        }
    }
}
