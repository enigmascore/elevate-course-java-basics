package answers.q09_classes;

/**
 * Exercise q09 - classes, constructors, encapsulation.
 * The fields are PRIVATE and must stay that way - the outside world goes
 * through the methods.
 */
public class BankAccount {

    private final String owner;
    private int balance;

    public BankAccount( String owner, int openingBalance ) {
        this.owner = owner;
        this.balance = openingBalance;
    }

    public String getOwner() {
        throw new UnsupportedOperationException( "implement me" );
    }

    public int getBalance() {
        throw new UnsupportedOperationException( "implement me" );
    }

    /**
     * Add the amount to the balance. A negative or zero amount is refused
     * with an IllegalArgumentException.
     */
    public void deposit( int amount ) {
        throw new UnsupportedOperationException( "implement me" );
    }

    /** e.g. "maria: 150" */
    @Override
    public String toString() {
        throw new UnsupportedOperationException( "implement me" );
    }
}
