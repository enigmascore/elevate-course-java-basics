package answers.q10_inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q10InheritanceTest {

    @Test
    void subclassesProvideTheirSound() {
        assertEquals( "woof", new Dog( "Rex" ).sound() );
        assertEquals( "meow", new Cat( "Misu" ).sound() );
    }

    @Test
    void theBaseClassComposesDescribe() {
        assertEquals( "Rex says woof", new Dog( "Rex" ).describe() );
        assertEquals( "Misu says meow", new Cat( "Misu" ).describe() );
    }
}
