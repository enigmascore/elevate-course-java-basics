package answers.q11_polymorphism;

public class Square implements Shape {

    private final double side;

    public Square( double side ) {
        this.side = side;
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
