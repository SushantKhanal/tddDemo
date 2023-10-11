package guru.springframework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicationDollar() {
        Dollar five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        Dollar dollar1 = Money.dollar(5);
        assertEquals(dollar1, Money.dollar(5));
        assertNotEquals(dollar1, Money.dollar(10));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testMultiplicationFranc() {
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        Franc franc1 = Money.franc(5);
        assertEquals(franc1, Money.franc(5));
        assertNotEquals(franc1, Money.franc(10));
    }
}
