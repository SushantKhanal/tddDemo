package guru.springframework;

public class Dollar extends Money{
    private String currency;
    public Dollar(int amount) {
        this.currency = "USD";
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    protected String currency() {
        return currency;
    }

}
