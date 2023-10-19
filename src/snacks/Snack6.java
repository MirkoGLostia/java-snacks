package snacks;

import java.util.Scanner;

public class Snack6 {
    /*
    text exe:
        Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
     */
    public static void main(String[] args) {
        // inizializzazione scan
        Scanner userInput = new Scanner(System.in);

        // apriamo variabile
        String orarioUserConvertito = "";

        // richiesta secondi all'utente
        System.out.println("Gimme the seconds");
        int userSeconds = userInput.nextInt();

        for (int i = 0; i < 3; i++) {
            if (i == 0){
                // conversione ore
                int hours = userSeconds / 3600;
                orarioUserConvertito += String.format("%02d", hours) + ":";
                userSeconds = userSeconds-(hours*3600);
            } else if (i == 1) {
                // conversione minuti
                int minutes = userSeconds / 60;
                orarioUserConvertito += String.format("%02d", minutes) + ":";
                userSeconds = userSeconds-(minutes*60);
            }else {
                // aggiunta minuti
                orarioUserConvertito += String.format("%02d", userSeconds);
            }
        }

        // risultato
        System.out.println("This is the equivalent in h-m-s:");
        System.out.println(orarioUserConvertito);

        // chiusura scanner
        userInput.close();
    }
}
