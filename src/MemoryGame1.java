//TODO implement loading animations
import java.util.Random;
import java.util.Scanner;

public class MemoryGame1 {
    public static void main(String[] args) {
        int size = 10, difficulty, upperbound = 10, score = 0;
        boolean hasWon = false;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        //setting the difficulty
        System.out.println("""
                Select level of difficulty
                1. Easy
                2. Medium
                3. Difficult
                """);
        difficulty = input.nextInt();

        if(difficulty == 2) {
            size = 20;
        }
        else if (difficulty == 3) {
           size = 30;
        }

        int[] randomNumbers = new int[size];
        int[] userNumbers = new int[size];

        //store random numbers in array
        for(int i = 0; i < size; i++) {
            randomNumbers[i] = rand.nextInt(upperbound) + 1;
        }

        System.out.println("Number of items: " + size);
        //output numbers
        for (int i = 0; i < size; i++) {
            System.out.print(randomNumbers[i] + "\t");
        }

        System.out.println("\nTime to insert the numbers.");

        //storing user input
        for (int j = 0; j < size; j++) {

            String suffix;

            if (j == 0 || j == 20) suffix = "st";
            else if (j == 1 || j == 21) suffix = "nd";
            else if (j == 2 || j == 22) suffix = "rd";
            else suffix = "th";

            System.out.print((j + 1) + suffix + ": ");
            userNumbers[j] = input.nextInt();
        }

        //check if user input matches numbers generated
        for(int i = 0; i < size; i++) {
            if(userNumbers[i] == randomNumbers[i]) {
                score++;
            }
        }

        if(score >= 8) {
            hasWon = true;
            System.out.println("You have gotten " + score + " and have won");
        }
    }



    @Override
    public String toString() {
        return "MemoryGame{}";
    }
}
