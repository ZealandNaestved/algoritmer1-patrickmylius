import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Algorithms1Test {

    //Testing random boy name
    @Test
    void randomBoyName() {
        Algorithms1 testName = new Algorithms1(); //Object of Algoritmhs1

        testName.rand.setSeed(15L); //Sets seed, to generate a "Specific" random numb. O.O
        testName.rand.nextInt(10);

        Assertions.assertEquals("Blær", testName.randomBoyName());
    }

    //Testing randomGirlName
    @Test
    void randomGirlName() {
    }

    //Testing randomName
    @Test
    void randomName() {
    }
}