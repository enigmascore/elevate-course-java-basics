package answers.q05_methods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q05MethodsTest {

    private final Overloads overloads = new Overloads();

    @Test
    void staticAddNeedsNoInstance() {
        assertEquals( 5, Overloads.add( 2, 3 ) );
    }

    @Test
    void instanceMultiply() {
        assertEquals( 6, overloads.multiply( 2, 3 ) );
    }

    @Test
    void overloadsPickedByArgumentType() {
        assertEquals( "int: 42", overloads.describe( 42 ) );
        assertEquals( "text: hello", overloads.describe( "hello" ) );
    }
}
