package snacks;

import java.util.Arrays;
import java.util.Scanner;

public class Snack4 {
    /*
    text exe:
        Data in input una stringa verificare se è palindroma
     */
    public static void main(String[] args) {
        // inizializziamo lo scanner
        Scanner userInput = new Scanner(System.in);

        // chiediamo una stringa ll'utente
        System.out.print("Insert word: ");
        String userString = userInput.nextLine();
        // trasformo la stringa in un array di char
        char[] userCharOriginal = userString.toCharArray();
        char[] userCharReverse = new char[userCharOriginal.length];

        // scorro l'array all'indietro
        for (int i = userCharOriginal.length - 1; i >= 0; i--) {
          userCharReverse[userCharOriginal.length - i - 1] = userCharOriginal[i];
        }

        if (Arrays.equals(userCharOriginal, userCharReverse)){
            System.out.println("they are palyndrome");
        }else {
            System.out.println("they are not palyndrome");
        }

        /*
        char[] invertedChars = new char[word.length()];
        for (int i = word.length() - 1, j = 0; i >= 0 && j < word.length(); i--, j++) {
            //invertedChars[word.length() - i - 1] = word.charAt(i);
            invertedChars[j] = word.charAt(i);
        }
        String invertedString = String.valueOf(invertedChars);

         */

        // chiudiamo lo scanner
        userInput.close();

    }
}
