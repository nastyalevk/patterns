package strategy.justStrategy.impl;

import strategy.justStrategy.api.Discounter;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}
