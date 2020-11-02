import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Algorithms1Test {

    //Testing random boy name
    @Test
    void randomBoyName() {
        Algorithms1 testName = new Algorithms1(); //Object of Algoritmhs1

        testName.rand.setSeed(15L); //Sets seed, to generate a "Specific" random numb. O.O

        //Test:
        //Expected result: Life
        Assertions.assertEquals("Life", testName.randomBoyName());
        //Actual result: Life
    }

    //Testing randomGirlName
    @Test
    void randomGirlName() {
        Algorithms1 testGirlName = new Algorithms1(); //Object of Algoritmhs1

        testGirlName.rand.setSeed(30L); //Sets, seed, generating a "specific" random numb.
        //Test:
        //Expected result: Europe
        Assertions.assertEquals("Europe", testGirlName.randomGirlName());
        //Actual result: Europe
    }

    //Testing randomName
    @Test
    void randomName() {
        Algorithms1 testRandomName = new Algorithms1(); //Object of Algoritmhs1

        //Declaring array testBoy and testGirl, contains 10 String values in total
        String[] testBoy = {"Patrick", "Peter", "Usamah", "Anders", "Kim"};
        String[] testGirl = {"Laila", "Isabella", "Delal", "Daniella", "Louise"};

        int expectedResult = 10; //Expected index arr.length return

        //Creates new arr, with return from randomName method.
        String[] testNewArr = testRandomName.randomName(testBoy, testGirl);

        //souts new arr values
        for (int i = 0; i < testNewArr.length; i++) {
            System.out.println(testNewArr[i]);
        }

        //Test if expected is equal to actual
        Assertions.assertEquals(expectedResult, testNewArr.length);
    }
}