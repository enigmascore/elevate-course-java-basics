package answers.q13_exceptions;

/**
 * Exercise q13 - exceptions: refusing bad input with a message a HUMAN can
 * act on, and recovering with a fallback.
 */
public class SafeParser {

    /**
     * Parse an age. Not a whole number -> IllegalArgumentException with the
     * message "not a whole number: <text>". Outside 0..150 ->
     * IllegalArgumentException with the message "not a believable age: <n>".
     */
    public int parseAge( String text ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** Parse the text as an int, or return the fallback when it cannot be. */
    public int parseOrDefault( String text, int fallback ) {
        throw new UnsupportedOperationException( "implement me" );
    }
}
