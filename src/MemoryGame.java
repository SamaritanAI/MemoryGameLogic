//TODO Check user answers in order
//TODO check user answers in reverse
//TODO check how many digits the entered were in the list == check which Data structure would be optimal

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digits = 10, difficulty = 1;

        //setting the difficulty
        System.out.println("""
                Select level of difficulty
                1. Easy
                2. Medium
                3. Difficult
                """);
        difficulty = input.nextInt();

        if(difficulty == 2) {
            digits = 20;
        }
        else if (difficulty == 3) {
            digits = 30;
        }
        int[] arrReverse = new int[digits];
        int[] arrAnswers = new  int[digits];
    }

    public static int[] randomNumbers(int size) {
        Random rand = new Random();
        int[] arrNumbers = new int[size];

        for(int i = 0; i < size; i++) {
            arrNumbers[i] = rand.nextInt();
        }

        return arrNumbers;
    }
}
