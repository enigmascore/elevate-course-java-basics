package answers.q12_generics;

/**
 * Exercise q12 - a generic class: a Box that holds ONE value of type T.
 */
public class Box<T> {

    private T content;

    /** Put a value in the box ( replacing whatever was there ). */
    public void store( T value ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** What the box holds ( null when empty ). */
    public T get() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
