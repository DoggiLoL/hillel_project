package edu.hillel.lesson12.benchMark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dummy.M();

//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//
//        long start = System.nanoTime();
//        for(int i = 0;i<10000000; i++){
//            list1.add(i);
//        }
//
//        long result = System.nanoTime() - start;
//
//        System.out.println("Time of adding to array list: "+ result/1000000 + " ms.");
//        long start1 = System.nanoTime();
//        for(int i = 0;i<10000000; i++){
//            list2.add(i);
//        }
//        long result1 = System.nanoTime() - start1;
//        System.out.println("Time of adding to linked list: "+ result1/1000000 + " ms.");

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long start = System.nanoTime();
        for(int i = 0;i<50; i++){
            list1.add(i + 20, i);
        }

        long result = System.nanoTime() - start;

        System.out.println("Time of adding to array list: "+ result/1000000 + " ms.");
        long start1 = System.nanoTime();
        for(int i = 0;i<10000000; i++){
            list2.add(i);
        }
        long result1 = System.nanoTime() - start1;
        System.out.println("Time of adding to linked list: "+ result1/1000000 + " ms.");
    }
}
