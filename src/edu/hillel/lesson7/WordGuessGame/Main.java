package edu.hillel.lesson7.WordGuessGame;
import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int randomIndex = random.nextInt(words.length);
        String secretWord = words[randomIndex];
        int wordLength = secretWord.length();

        char[] guessWord = new char[wordLength];

        for(int i = 0; i < wordLength; i++){
            guessWord[i] = '#';
        }
        System.out.println("Відгадайте слово:");
        while (true){
            System.out.println(guessWord);

            String userGuess = scan.nextLine().toLowerCase();
            if(userGuess.equals(secretWord)){
                break;
            } else {
                for (int i = 0; i < wordLength;i++){
                    if(i < userGuess.length() && userGuess.charAt(i)== secretWord.charAt(i)){
                        guessWord[i] = secretWord.charAt(i);
                    }
                }
            }
        }
        System.out.println("Победа!!! Вы угадали слово - " + secretWord+"!!!");
    }
}
