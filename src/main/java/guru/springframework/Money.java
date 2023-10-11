package guru.springframework;

public abstract class Money {
    protected int amount;

    public abstract Money times(int Multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount &&
                this.getClass().equals(obj.getClass());
    }
}
