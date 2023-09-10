package edu.hillel.lesson8.HomeWork8;

public class Main {
    public static void main(String[] args) {

        //пробуем с заведомо некорректным размером массива
        try {
            int result = doCalc(new String[][]{{"1", "a", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        //пробуем с заведомо некорректными данными в массиве
        try {
            int result = doCalc(new String[][]{{"1", "a", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"9", "10", "11", "12"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        //пробуем корреткные данные
        try {
            int result = doCalc(new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"9", "10", "11", "12"}});
            System.out.println(result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
