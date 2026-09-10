package answers.q11_polymorphism;

public class Circle implements Shape {

    private final double radius;

    public Circle( double radius ) {
        this.radius = radius;
    }

    /** pi * radius squared ( use Math.PI ). */
    @Override
    public double area() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
