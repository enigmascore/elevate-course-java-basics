package answers.q11_polymorphism;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class Q11PolymorphismTest {

    @Test
    void eachShapeComputesItsOwnArea() {
        assertEquals( Math.PI * 4.0, new Circle( 2 ).area(), 0.0001 );
        assertEquals( 9.0, new Square( 3 ).area(), 0.0001 );
        assertEquals( 6.0, new Triangle( 4, 3 ).area(), 0.0001 );
    }

    @Test
    void oneListManyBehaviours() {
        // three different classes in ONE List<Shape> - the same area() call
        // behaves differently per element, chosen at run time
        List<Shape> shapes =
                List.of( new Circle( 2 ), new Square( 3 ), new Triangle( 4, 3 ) );

        assertEquals( Math.PI * 4.0 + 9.0 + 6.0,
                new AreaCalculator().totalArea( shapes ), 0.0001 );
    }
}
