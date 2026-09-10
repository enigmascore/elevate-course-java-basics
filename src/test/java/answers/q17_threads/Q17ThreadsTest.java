package answers.q17_threads;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class Q17ThreadsTest {

    @Test
    void squaresInOrderUsingAPool() throws Exception {
        // Future.get() waits for each result, so the outcome is
        // deterministic however the pool schedules the work
        assertEquals( List.of( 1, 4, 9, 16, 25 ),
                new PoolWork().squareAll( List.of( 1, 2, 3, 4, 5 ) ) );
    }
}
