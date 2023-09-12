package edu.hillel.lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//    list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//
//        final Iterator<String> iterator = list.listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Before removing: "+list.size());

            for (Integer integer:
             list) {
            if(integer.equals(3)){
                list.remove(integer);
            }
        }

            List<Integer> toRemove = new ArrayList<>();

            for(Integer integer : list){
                if(integer.equals(3)){
                    toRemove.add(integer);
                }
            }

            list.removeAll(toRemove);

        System.out.println("After removing: "+list.size());
    }
}
