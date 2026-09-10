package answers.q13_exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Q13ExceptionsTest {

    private final SafeParser parser = new SafeParser();

    @Test
    void parsesAValidAge() {
        assertEquals( 42, parser.parseAge( "42" ) );
    }

    @Test
    void refusesNonNumbersWithAnActionableMessage() {
        IllegalArgumentException refused = assertThrows(
                IllegalArgumentException.class, () -> parser.parseAge( "forty" ) );

        assertEquals( "not a whole number: forty", refused.getMessage() );
    }

    @Test
    void refusesUnbelievableAges() {
        IllegalArgumentException refused = assertThrows(
                IllegalArgumentException.class, () -> parser.parseAge( "200" ) );

        assertEquals( "not a believable age: 200", refused.getMessage() );
    }

    @Test
    void fallsBackInsteadOfFailing() {
        assertEquals( 7, parser.parseOrDefault( "7", -1 ) );
        assertEquals( -1, parser.parseOrDefault( "seven", -1 ) );
    }
}
