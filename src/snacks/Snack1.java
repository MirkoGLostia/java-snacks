package snacks;

import java.util.Scanner;

public class Snack1 {
    /*
    text exe:
        Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
        Se il numero è negativo termina.
     */
    public static void main(String[] args) {
        // inizializziamo lo scanner
        Scanner userImput = new Scanner(System.in);

        // chiediamo allo user un numero
        System.out.println("Gimme a number:");
        double number = Double.parseDouble(userImput.nextLine());

        // iniziamo a scansionare i numeri, in modo da richiedere all'infinito in caso di numero pari, e terminare con negativo
        do {
            System.out.print("gimme another number, maybe this time will end... ");
            number = Double.parseDouble(userImput.nextLine());
            if (number % 2 == 1){
                number++;
            }
        }
        while (number % 2 == 0);

        System.out.println("YOU'VE DONE IT, THE LOOP IS CLOSED");

        // terminiamo lo scanner
        userImput.close();
    }
}
