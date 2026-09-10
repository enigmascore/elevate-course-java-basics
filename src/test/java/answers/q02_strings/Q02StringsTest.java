package answers.q02_strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Q02StringsTest {

    private final StringFacts facts = new StringFacts();

    @Test
    void sameContentComparesContent() {
        // built with new so the references differ but the content matches
        String a = new String( "java" );
        String b = new String( "java" );

        assertTrue( facts.sameContent( a, b ) );
        assertFalse( facts.sameObject( a, b ) );
    }

    @Test
    void sameObjectComparesReferences() {
        String a = "java";

        assertTrue( facts.sameObject( a, a ) );
    }

    @Test
    void shoutUpperCasesAndAppends() {
        String original = "hello";

        assertEquals( "HELLO!", facts.shout( original ) );
        // immutability: the original is untouched
        assertEquals( "hello", original );
    }
}
