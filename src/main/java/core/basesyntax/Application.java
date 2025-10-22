package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball = new Ball();
        int ballsQuantity = 3;
        for (int i = 0; i < ballsQuantity; i++) {
            lottery.getRandomBall(ball);
        }
    }
}
