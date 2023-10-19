package snacks;

import java.util.Scanner;

public class Snack5 {
    /*
    text exe:
        Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
        Possibile usare solo :
        cicli
        chartAt
        if / switch
        Es. “25" come stringa deve essere convertito in intero 25.
     */
    public static void main(String[] args) {
        // inizializzazione scanner
        Scanner userInput = new Scanner(System.in);

        // variabili uttili
        int userStringToNumber = 0;
        int i = 0;
        boolean negativeStringValue = false;

        // chiediamo un numero allo user
        System.out.println("Gimme a number");
        String userString = userInput.nextLine();

        if( userString.charAt(0) == '-' ){
            negativeStringValue = true;
            i = 1;
        }

        do {
            userStringToNumber *= 10;
            userStringToNumber += ( userString.charAt(i++) - '0' );
        }while (i < userString.length());

        if (negativeStringValue){
            userStringToNumber = -userStringToNumber;
        }

        System.out.println(userStringToNumber);

        // chiudiamo scanner
        userInput.close();
    }
}
