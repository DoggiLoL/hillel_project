package edu.hillel.lesson3.encapsulation;

public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Policeman policeman = new Policeman();
        policeman.setTesla(tesla);
        policeman.checkSpeed();
    }
}
