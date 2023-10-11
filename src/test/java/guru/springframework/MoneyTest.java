package guru.springframework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplication() {
        Money fiveDollar = Money.dollar(5);
        assertEquals(Money.dollar(10), fiveDollar.times(2));
        assertEquals(Money.dollar(15), fiveDollar.times(3));

        Money fiveFranc = Money.franc(5);
        assertEquals(Money.franc(10), fiveFranc.times(2));
    }

    @Test
    void testEqualityDollar() {
        Money dollar1 = Money.dollar(5);
        assertEquals(dollar1, Money.dollar(5));
        assertNotEquals(dollar1, Money.dollar(10));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testEqualityFranc() {
        Money franc1 = Money.franc(5);
        assertEquals(franc1, Money.franc(5));
        assertNotEquals(franc1, Money.franc(10));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(2).currency());
    }
}
