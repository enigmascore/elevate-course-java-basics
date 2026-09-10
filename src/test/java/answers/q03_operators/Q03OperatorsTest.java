package answers.q03_operators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q03OperatorsTest {

    private final Arithmetic arithmetic = new Arithmetic();

    @Test
    void integerDivisionDropsTheFraction() {
        assertEquals( 3, arithmetic.wholeTimes( 7, 2 ) );
    }

    @Test
    void preciseDivisionKeepsTheFraction() {
        assertEquals( 3.5, arithmetic.precisely( 7, 2 ), 0.0001 );
    }

    @Test
    void remainderAndEvenness() {
        assertEquals( 1, arithmetic.remainder( 7, 2 ) );
        assertTrue( arithmetic.isEven( 10 ) );
        assertFalse( arithmetic.isEven( 7 ) );
    }
}
