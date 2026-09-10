package answers.q04_control_flow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Q04ControlFlowTest {

    private final ControlFlow flow = new ControlFlow();

    @Test
    void gradesTheBands() {
        assertEquals( "distinction", flow.grade( 82 ) );
        assertEquals( "pass", flow.grade( 50 ) );
        assertEquals( "fail", flow.grade( 49 ) );
    }

    @Test
    void namesTheDays() {
        assertEquals( "Monday", flow.dayName( 1 ) );
        assertEquals( "Sunday", flow.dayName( 7 ) );
        assertEquals( "unknown", flow.dayName( 9 ) );
    }

    @Test
    void sumsWithALoop() {
        assertEquals( 55, flow.sumUpTo( 10 ) );
        assertEquals( 1, flow.sumUpTo( 1 ) );
    }
}
