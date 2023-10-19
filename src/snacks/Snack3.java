package snacks;

public class Snack3 {
    /*
    text exe:
        Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
     */
    public static void main(String[] args) {
        int[] listOfNumbers = {2, 5, 8, 61, 78, 95, 4};
        int summOfNumbers = 0;

        for (int i = 0; i < listOfNumbers.length; i++) {
            if (i % 2 == 1){
                summOfNumbers += listOfNumbers[i];
            }
        }

        System.out.println(summOfNumbers);
    }
}
