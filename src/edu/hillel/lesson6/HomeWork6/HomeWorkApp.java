package edu.hillel.lesson6.HomeWork6;

import java.util.Random;

public class HomeWorkApp {
    static Random rand = new Random();
    public static void main(String[] args) {

        System.out.println("printThreeWords");
        printThreeWords();

        System.out.println("-----------");

        System.out.println("checkSumSign");
        checkSumSign();

        System.out.println("-----------");

        System.out.println("printColor");
        printColor();

        System.out.println("-----------");

        System.out.println("compareNumbers");
        compareNumbers();

        System.out.println("-----------");

        System.out.println("checkSum");
        checkSum(1,2);

        System.out.println("-----------");

        System.out.println("checkNumber");
        checkNumber();

        System.out.println("-----------");

        System.out.println("checkNumb");
        System.out.println(checkNumb(10));

        System.out.println("-----------");

        System.out.println("printRow");
        printRow(5);

        System.out.println("-----------");

        System.out.println("isLeapYear");
        System.out.println(isLeapYear(2025));
    }
    //Створіть метод printThreeWords(), який під час виклику повинен надрукувати в стовпець у три слова: Orange, Banana, Apple.
    protected static void printThreeWords(){
        System.out.println("Orange"+"\n"+"Banana"+"\n"+"Apple");
    }
    //Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете.
    // Далі метод повинен підсумувати ці змінні, і якщо їх сума більша або дорівнює 0, то вивести в консоль повідомлення "Сума позитивна", інакше - "Сума негативна";
    protected static void checkSumSign(){
        int a = rand.nextInt();
        int b = rand.nextInt();
        int c = a + b;
        if(c>=0){
            System.out.println("Сумма позитивная");
        } else{
            System.out.println("Сумма негативная");
        }
    }
    //Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її будь-яким значенням.
    // Якщо значення менше 0 (0 включно), то в консоль метод повинен вивести повідомлення "Червоний",
    // якщо лежить в межах від 0 (0 виключно) до 100 (100 включно), то "Жовтий", якщо більше 100 (100 виключно) - "Зелений";
    protected static void printColor(){
        int value = rand.nextInt();
        if(value <= 0){
            System.out.println("Красный");
        } else if (0<= value && value <=100 ) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b,
    // та ініціалізуйте їх будь-якими значеннями, якими захочете. Якщо a більше або одно b, необхідно вивести в консоль повідомлення “a >= b”, інакше “a < b”;
    protected static void compareNumbers(){
        int a = rand.nextInt();
        int b = rand.nextInt();
        if(a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    //Написати метод, який приймає на вхід два цілих числа і перевіряє, що їхня сума лежить в межах від 10 до 20 (включно),
    //якщо так – повернути true, інакше – false.
    protected static void checkSum(int a, int b){
        int c = a+b;
        if(c>=10 && c<=20){
            System.out.println("true");;
        } else {
            System.out.println("false");;
        }
    }
    //Написати метод, якому як параметр передається ціле число,
    // метод повинен надрукувати в консоль, чи додатнє число передали або від’ємне. Примітка: нуль вважаємо позитивним числом.
    protected static void checkNumber(){
        int a = rand.nextInt();
        if(a<0){
            System.out.println("Число отрицательное");
        }else {
            System.out.println("Число позитивное");
        }
    }
    protected static boolean checkNumb(int a){
        if(a>=0){
            return true;
        } else {
            return false;
        }
    }
    //Написати метод, якому як аргументи передається рядок і число, метод повинен надрукувати в консоль зазначений рядок, вказану кількість разів;
    protected static void printRow(int countOfRows){
        int numberOfRow = 1;
        for(int i=0;i<=countOfRows;i++){
            System.out.println(numberOfRow+". " +"SomeText");
            numberOfRow++;
        }
    }
    protected static boolean isLeapYear(int year){
        if ((year % 4 == 0) && year % 100 != 0)
        {
            return true;
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            return false;
        }
        else
        {
            return false;
        }
    }
}
