package answers.q16_streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class Q16StreamsTest {

    private final StreamWork work = new StreamWork();

    @Test
    void filtersMapsAndSorts() {
        List<String> names = List.of( "bo", "carol", "al", "dave" );

        assertEquals( List.of( "CAROL", "DAVE" ),
                work.longNamesShouted( names, 4 ) );

        // a stream never mutates its source
        assertEquals( List.of( "bo", "carol", "al", "dave" ), names );
    }

    @Test
    void countsMatches() {
        assertEquals( 2, work.countContaining(
                List.of( "anna", "bob", "hannah" ), "nn" ) );
    }
}
