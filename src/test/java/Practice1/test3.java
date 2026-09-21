package Practice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class test3 {

    @Test
    void differentNumbersAreSummed() {
        int[] result = task3VAR6.process(67, 52);
        assertArrayEquals(new int[] { 119, 119 }, result);
    }

    @Test
    void equalNumbersBecomeZero() {
        int[] result = task3VAR6.process(5, 5);
        assertArrayEquals(new int[] { 0, 0 }, result);
    }

    @Test
    void negativeAndPositiveAreSummed() {
        int[] result = task3VAR6.process(-3, 3);
        assertArrayEquals(new int[] { 0, 0 }, result);
    }
}
