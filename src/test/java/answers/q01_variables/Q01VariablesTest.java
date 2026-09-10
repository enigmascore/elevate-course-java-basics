package answers.q01_variables;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q01VariablesTest {

    private final VariableBasics basics = new VariableBasics();

    @Test
    void widensAnIntToALong() {
        assertEquals( 42L, basics.widenToLong( 42 ) );
        assertEquals( -7L, basics.widenToLong( -7 ) );
    }

    @Test
    void truncatesTowardZero() {
        assertEquals( 3, basics.truncate( 3.99 ) );
        assertEquals( -3, basics.truncate( -3.99 ) );
    }

    @Test
    void knowsTheLargestInt() {
        assertEquals( Integer.MAX_VALUE, basics.largestInt() );
    }
}
