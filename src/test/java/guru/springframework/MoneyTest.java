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
        assertNotEquals(Money.dollar(5), new Franc(5));
    }

    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        Franc franc1 = new Franc(5);
        assertEquals(franc1, new Franc(5));
        assertNotEquals(franc1, new Franc(10));
    }
}
