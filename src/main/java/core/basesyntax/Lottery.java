package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall(Ball ball) {
        int maxNumber = 100;
        ball.setNumber(new Random().nextInt(maxNumber));
        ball.setColor(ColorSupplier.getRandomColor());
        System.out.println("The ball with number " + ball.getNumber() + " is " + ball.getColor());
        return ball;
    }
}
