package answers.q07_collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Q07CollectionsTest {

    private final CollectionWork work = new CollectionWork();

    @Test
    void filtersNamesByFirstLetter() {
        List<String> names = List.of( "alice", "bob", "anna", "carol" );

        assertEquals( List.of( "alice", "anna" ),
                work.namesStartingWith( names, 'a' ) );
    }

    @Test
    void mapsWordsToLengths() {
        Map<String, Integer> lengths =
                work.wordLengths( List.of( "tea", "coffee" ) );

        assertEquals( 2, lengths.size() );
        assertEquals( 3, lengths.get( "tea" ) );
        assertEquals( 6, lengths.get( "coffee" ) );
    }

    @Test
    void unknownItemsCountAsZero() {
        Map<String, Integer> stock = Map.of( "apples", 5 );

        assertEquals( 5, work.countOf( stock, "apples" ) );
        assertEquals( 0, work.countOf( stock, "pears" ) );
    }
}
