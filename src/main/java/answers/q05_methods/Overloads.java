package answers.q05_methods;

/**
 * Exercise q05 - methods: overloading, static vs instance.
 */
public class Overloads {

    /** STATIC: belongs to the class, no instance needed. */
    public static int add( int a, int b ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** Instance method. */
    public int multiply( int a, int b ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** Overload: describe an int. Returns e.g. "int: 42". */
    public String describe( int value ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** Overload: describe a String. Returns e.g. "text: hello". */
    public String describe( String value ) {
        throw new UnsupportedOperationException( "implement me" );
    }
}
