package answers.q12_generics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class Q12GenericsTest {

    @Test
    void aBoxHoldsWhatItsTypeSays() {
        Box<String> words = new Box<>();
        words.store( "hello" );
        assertEquals( "hello", words.get() );

        Box<Integer> numbers = new Box<>();
        numbers.store( 42 );
        assertEquals( 42, numbers.get() );
    }

    @Test
    void aGenericMethodWorksForAnyElementType() {
        assertEquals( "a", Generic.first( List.of( "a", "b" ) ) );
        assertEquals( 1, Generic.first( List.of( 1, 2, 3 ) ) );
    }
}
