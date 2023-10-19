package snacks;

import java.util.Random;

public class Snack2 {
    /*
    text exe:
        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
     */
    public static void main(String[] args) {
        // array nomi e cognomi
        String[] nomiInvitaiti = {"Mario", "Giovanni", "Francesco", "Dario", "Marcello"};
        String[] cognomiInvitati = {"Rossi", "De Pauperis", "Galli", "Pisu", "Correlli"};

        // inizializzazione randomizzatore
        Random randomNumber = new Random();

        // variabili utili
        int numeroNomi = 5;
        int numeroCognomi = 5;
        int numeroInvitati = 10;

        for (int i = 0; i < numeroInvitati; i++) {
            System.out.println(nomiInvitaiti[randomNumber.nextInt(0, numeroNomi)] + " " + cognomiInvitati[randomNumber.nextInt(0, numeroCognomi)]);
        }
    }
}
