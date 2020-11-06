/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {
    public static void main(String[] args) {
        int[] randomNumbers1000 = new Data().getRandomNumbers1000();
        String[] randomBoyNames = new Data().getRandomDrengeNavne();
        linearSearch(randomNumbers1000);
        linearSearch(randomBoyNames);
    }

    //Method linear searching for its expectedResult = 77
    //1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH
    public static void linearSearch(int[] randomNumbers1000) {
        int expectedResult = 77;
        //runs expectedResult agaisnt all numbs in randomNumbers1000 array
        for (int i = 0; i < randomNumbers1000.length; i++) {
            if (randomNumbers1000[i] == expectedResult) {
                System.out.println("Number: " + expectedResult + " found in randomNumbers1000");
            } else continue;
        }
    }

    //2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH
    //Method searching for its expectedResult = "Awesome".
    public static void linearSearch(String[] randomBoyNames) {
        String expectedResult = "Awesome";
        //runs expectedResult agaisnt all strings in randomDrengeNavne.
        for (int i = 0; i < randomBoyNames.length; i++) {
            if (randomBoyNames[i] == expectedResult) {
                System.out.println("Boy name: " + expectedResult + " found in randomDrengeNavne");
            } else continue;

        }
    }
    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH


}
