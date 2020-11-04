/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {
    public static void main(String[] args) {
        int []randomNumbers1000 = new Data().getRandomNumbers1000();
        linearSearch(randomNumbers1000);
    }
    //Method searching for the value "77"
    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH
    public static void linearSearch(int[] randomNumbers1000) {
        int value = 77;
        //runs value agaisnt all numbs in randomNumbers1000 array
        for (int i = 0; i < randomNumbers1000.length; i++) {
            if (randomNumbers1000[i] == value) {
                System.out.println("Number: " + value + " found in randomNumbers1000");
            } else System.out.println(" ");;
        }
    }

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH


}
