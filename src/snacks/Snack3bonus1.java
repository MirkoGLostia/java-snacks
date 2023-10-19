package snacks;

import java.util.Random;

public class Snack3bonus1 {
    public static void main(String[] args) {
        Random randomNumber = new Random();

        // variabili uttili
        int lengthOfArray = 10;
        int boundRandomNumber = 100;
        int summOfNumbers = 0;
        int[] listOfNumbers = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            int number = randomNumber.nextInt(0, boundRandomNumber);
            listOfNumbers[i] = number;

            // debug
            // System.out.println(number);
        }

        for (int i = 0; i < lengthOfArray; i++) {
            if (i % 2 == 1){
                summOfNumbers += listOfNumbers[i];
            }
        }

        System.out.println("The total is: " + summOfNumbers);
    }

}
