package edu.hillel.Lesson15;

public class Main {
    public static void main(String[] args) {
        TestInterface test = new TestImpl();
        System.out.println(test.calculate(1,1));

//        TestInterface testInterface = (int a1, int a2) -> {return a1+a2;};
//        TestInterface testInterface = (int a1, int a2) -> a1 + a2;
//        TestInterface testInterface = (a1, a2) -> a1+a2;

        TestInterface testInterface = Integer::sum;
        System.out.println(testInterface.calculate(5, 7));
        testInterface = (a1, a2) -> a1-a2;
        System.out.println(testInterface.calculate(5, 2));
    }
}
