package edu.hillel.lesson7.HomeWork7;

public class Main {

    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Hello World!", 'l'));
        System.out.println(findWordPosition("Apple", "pp"));
        System.out.println(stringReverse("Apple"));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));

    }
    protected static int findSymbolOccurance(String Some_Text, char Symbol ){

        int countOfSymbols = 0;
        for(int i= 0;i < Some_Text.length(); i++){
            if(Some_Text.charAt(i) == Symbol){
                countOfSymbols++;
            }
        }
        return  countOfSymbols;
    }

    protected static int findWordPosition(String source, String target){
        if(source.contains(target)){
            return 1;
        }
        return -1;
    }

    protected static String stringReverse(String someText){
        return new StringBuilder(someText).reverse().toString();
    }

    protected static boolean isPalindrome(String SomeText){
        String clean = SomeText.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
    }

