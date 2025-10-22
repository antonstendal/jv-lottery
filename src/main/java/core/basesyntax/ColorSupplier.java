package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        String randomColor = String.valueOf(Colors.values()[index]);
        return randomColor;
    }
}
