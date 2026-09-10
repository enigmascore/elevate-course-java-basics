package answers.q10_inheritance;

public class Dog extends Animal {

    public Dog( String name ) {
        super( name );
    }

    /** A dog says "woof". */
    @Override
    public String sound() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
