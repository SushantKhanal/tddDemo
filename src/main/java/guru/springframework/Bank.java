package guru.springframework;

import java.util.HashMap;

public class Bank {
    private final HashMap<Pair, Integer> rateMap = new HashMap<>();
    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }
    public int rate(String from, String to) {
        Integer rate = rateMap.get(new Pair(from, to));
        if(from.equals(to)) {
            return 1;
        }
        return rate;
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
