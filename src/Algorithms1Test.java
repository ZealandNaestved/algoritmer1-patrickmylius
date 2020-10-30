import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Algorithms1Test {

    //Testing random boy name
    @Test
    void randomBoyName() {
        Algorithms1 testName = new Algorithms1();

        testName.rand.setSeed(15L);
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