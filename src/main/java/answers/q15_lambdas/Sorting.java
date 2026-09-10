package answers.q15_lambdas;

import java.util.Comparator;
import java.util.List;

/**
 * Exercise q15 - lambdas and method references via Comparator.
 */
public class Sorting {

    /** Sort the words IN PLACE, shortest first ( a comparator lambda ). */
    public void sortByLength( List<String> words ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /**
     * A comparator ordering strings by their LAST letter - return it as a
     * lambda; the test hands it to List.sort.
     */
    public Comparator<String> byLastLetter() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
