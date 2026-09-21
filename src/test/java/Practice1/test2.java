package Practice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class test2 {

    @Test
    void calculatesForX2() {
        double result = task2VAR6.calculate(2.0);
        assertEquals(4.575851076012219, result, 0.0001);
    }

    @Test
    void calculatesForX10() {
        double result = task2VAR6.calculate(10.0);
        assertEquals(11.066800085419466, result, 0.0001);
    }

    @Test
    void isNanForNonPositiveX() {
        double result = task2VAR6.calculate(-1.0);
        assertTrue(Double.isNaN(result));
    }
}
