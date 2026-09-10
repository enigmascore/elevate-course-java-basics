package answers.q15_lambdas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Q15LambdasTest {

    private final Sorting sorting = new Sorting();

    @Test
    void sortsByLength() {
        List<String> words = new ArrayList<>( List.of( "coffee", "tea", "milk" ) );

        sorting.sortByLength( words );

        assertEquals( List.of( "tea", "milk", "coffee" ), words );
    }

    @Test
    void comparesByLastLetter() {
        List<String> words = new ArrayList<>( List.of( "jazz", "rock", "pop" ) );

        words.sort( sorting.byLastLetter() );

        assertEquals( List.of( "rock", "pop", "jazz" ), words );
    }
}
