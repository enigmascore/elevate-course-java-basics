package answers.q08_structures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import org.junit.jupiter.api.Test;

class Q08StructuresTest {

    private final StructureChoices choices = new StructureChoices();

    @Test
    void queuesAreFirstInFirstOut() {
        Deque<String> queue = choices.asQueue( List.of( "a", "b", "c" ) );

        assertEquals( "a", choices.takeNext( queue ) );
        assertEquals( "b", choices.takeNext( queue ) );
    }

    @Test
    void aDequeIsAlsoAStack() {
        Deque<String> stack = choices.asQueue( List.of( "a", "b", "c" ) );

        assertEquals( "c", choices.takeNewest( stack ) );
    }

    @Test
    void insertionOrderIsKept() {
        Map<String, Integer> map =
                choices.keepingInsertionOrder( List.of( "zebra", "apple", "mango" ) );

        assertEquals( List.of( "zebra", "apple", "mango" ),
                new ArrayList<>( map.keySet() ) );
        assertEquals( 1, map.get( "apple" ) );
    }

    @Test
    void sortedMapsIterateInKeyOrder() {
        SortedMap<String, Integer> sorted = choices.sortedByKey(
                Map.of( "zebra", 0, "apple", 1, "mango", 2 ) );

        assertEquals( List.of( "apple", "mango", "zebra" ),
                new ArrayList<>( sorted.keySet() ) );
    }

    @Test
    void setsCollapseDuplicates() {
        assertEquals( 2,
                choices.distinct( List.of( "tea", "tea", "coffee" ) ).size() );
    }
}
