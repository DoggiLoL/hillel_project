package edu.hillel.Lesson15;

public class TestImpl implements TestInterface{

    @Override
    public int calculate(int a1, int a2) {
        System.out.println(getConstant());
        return a1+a2;
    }
}
