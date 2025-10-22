package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {

    public void getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        setNumber(new Random().nextInt(100));
        setColor(colorSupplier.getRandomColor());
        System.out.println("The ball with number " + getNumber() + " is " + getColor());
    }
}
