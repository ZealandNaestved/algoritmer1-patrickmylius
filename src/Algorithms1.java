import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

    //1 - Gennemse Data klassen, og skriv gode kommentarer til det

    //2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomPigeNavne property OBS: randomPigeNavne skal forblive private!

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

    //4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    // 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void main(String[] args) {
        //execute method exampleOfPredicatableRandomNumber
        exampleOfPredictableRandomNumber();

        //Execute method randomBoyName + randomGirlName, sets results to String boy and girl
        Algorithms1 algo1 = new Algorithms1();
        String boy = algo1.randomBoyName();
        String girl = algo1.randomGirlName();
        //souts results of random names
        System.out.println(boy);
        System.out.println(girl);

        //Declare new arrays, copying array getters from Data class
        String[] boyNames = new Data().getRandomDrengeNavne();
        String[] girlNames = new Data().getRandomPigeNavne();
        //Executes randomName method with boyNames and girlnames
        //sets result to unisexNames
        String[] unisexNames = algo1.randomName(boyNames, girlNames);

        //For loop, souts all names in new array
        for (int i = 0; i < 89; i++) {
            System.out.println(unisexNames[i]);
        }
    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

    //Method randomBoyName use getters from Data class
    //returns a random boy name
    public String randomBoyName() {
        Random rand = new Random();
        String[] boyName = new Data().getRandomDrengeNavne();

        return boyName[rand.nextInt(boyName.length)];
    }

    //Method randomGirlName use getters from Data class
    //returns a random girl name
    public String randomGirlName() {
        Random rand = new Random();
        String[] girlName = new Data().getRandomPigeNavne();

        return girlName[rand.nextInt(girlName.length)];
    }

    public String[] randomName(String[] arr1, String[] arr2) {

        //declare length to be arr1 + arr 2 lengths
        int length = arr1.length + arr2.length;
        //declare new array randName sets length to be equal to boyName and girlName array
        String[] randName = new String[length];
        int position = 0;

        //for loop, copying elements from old boyName array to randName array
        for (String element : arr1) {
            randName[position] = element;
            position++; //increase position by 1 for each run through
        }
        //for loop, copying elements from old girlName array to randName array
        for (String element : arr2) {
            randName[position] = element;
            position++;
        }
        return randName;
    }

}
