package answers.q06_arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q06ArraysTest {

    private final ArrayWork work = new ArrayWork();

    @Test
    void sumsValues() {
        assertEquals( 10, work.sum( new int[] { 1, 2, 3, 4 } ) );
        assertEquals( 0, work.sum( new int[] {} ) );
    }

    @Test
    void findsTheLargest() {
        assertEquals( 9, work.largest( new int[] { 3, 9, 4 } ) );
    }

    @Test
    void reversesIntoANewArray() {
        int[] input = { 1, 2, 3 };

        assertArrayEquals( new int[] { 3, 2, 1 }, work.reversed( input ) );
        // the input must be untouched
        assertArrayEquals( new int[] { 1, 2, 3 }, input );
    }
}
