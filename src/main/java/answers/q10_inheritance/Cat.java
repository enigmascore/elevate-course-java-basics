package answers.q10_inheritance;

public class Cat extends Animal {

    public Cat( String name ) {
        super( name );
    }

    /** A cat says "meow". */
    @Override
    public String sound() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
