package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalSouceDecorator extends AbstractPizzaOrderDecorator {
    public AdditionalSouceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + additional souce";
    }
}
