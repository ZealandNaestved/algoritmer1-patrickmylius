import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    //Testing random boy name
    @org.junit.jupiter.api.Test
    void randomBoyName() {
        Algorithms1 testName = new Algorithms1();
        String randomName = testName.randomBoyName();

        Random rand = new Random();

        rand.setSeed(15L);
        rand.nextInt(10);
        System.out.println(randomName);
    }

    @org.junit.jupiter.api.Test
    void randomGirlName() {
    }

    @org.junit.jupiter.api.Test
    void randomName() {
    }
}