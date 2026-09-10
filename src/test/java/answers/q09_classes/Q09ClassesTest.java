package answers.q09_classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Q09ClassesTest {

    @Test
    void constructorAndGetters() {
        BankAccount account = new BankAccount( "maria", 100 );

        assertEquals( "maria", account.getOwner() );
        assertEquals( 100, account.getBalance() );
    }

    @Test
    void depositsAddUp() {
        BankAccount account = new BankAccount( "maria", 100 );

        account.deposit( 50 );

        assertEquals( 150, account.getBalance() );
    }

    @Test
    void nonPositiveDepositsAreRefused() {
        BankAccount account = new BankAccount( "maria", 100 );

        assertThrows( IllegalArgumentException.class, () -> account.deposit( 0 ) );
        assertThrows( IllegalArgumentException.class, () -> account.deposit( -5 ) );
        assertEquals( 100, account.getBalance() );
    }

    @Test
    void toStringShowsOwnerAndBalance() {
        assertEquals( "maria: 150", new BankAccount( "maria", 150 ).toString() );
    }
}
