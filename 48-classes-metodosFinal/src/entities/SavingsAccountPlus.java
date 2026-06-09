package entities;

public final class SavingsAccountPlus extends SavingsAccount{
// Essa classe não pode ser herdada, por causa da palavra final.

    @Override
    public final void withdraw(double amount) {
        balance -= amount + 2.0; // Esse método não pode ser sobreposto novamente, por causa da palavra final.
    }
}
