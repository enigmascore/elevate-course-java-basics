package answers.q11_polymorphism;

public class Triangle implements Shape {

    private final double base;
    private final double height;

    public Triangle( double base, double height ) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
