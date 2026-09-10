package answers.q08_structures;

import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/**
 * Exercise q08 - choosing the right structure. Each method's javadoc names
 * the BEHAVIOUR required; the course's which-one-when table names the
 * structure that delivers it.
 */
public class StructureChoices {

    /** Load the items into a queue that hands them back FIRST IN, FIRST OUT. */
    public Deque<String> asQueue( List<String> items ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** Take the next item from the FRONT of the queue. */
    public String takeNext( Deque<String> queue ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** Take the newest item from the BACK ( use the deque as a stack ). */
    public String takeNewest( Deque<String> stack ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /**
     * A map of each key to its position ( 0, 1, 2 ... ) that ITERATES IN
     * INSERTION ORDER.
     */
    public Map<String, Integer> keepingInsertionOrder( List<String> keys ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** The same entries, iterating in SORTED KEY order. */
    public SortedMap<String, Integer> sortedByKey( Map<String, Integer> raw ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** The distinct words - duplicates collapsed. */
    public Set<String> distinct( List<String> words ) {
        throw new UnsupportedOperationException( "implement me" );
    }
}
