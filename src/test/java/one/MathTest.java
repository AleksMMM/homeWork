package one;

import homeworks.hm5.one.Math;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathTest {

    @Test
    void pow() {
        double expected = 32.00;

        Assertions.assertEquals(expected, Math.pow(2.00, 5));
    }

    @Test
    void abs() {
    }

    @Test
    void getCircleSquare() {
    }
}