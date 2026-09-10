package answers.q10_inheritance;

/**
 * Exercise q10 - inheritance: subclasses provide sound(), the base class
 * composes describe() from it.
 */
public abstract class Animal {

    private final String name;

    protected Animal( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /** Each animal makes its own sound. */
    public abstract String sound();

    /** e.g. "Rex says woof" - implemented HERE, using sound(). */
    public String describe() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
