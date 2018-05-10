package vcs.CoffeeMachine.CoffeeCups;

import vcs.CoffeeMachine.*;

public class CappuccinoCoffeeCup extends CoffeeCup {

    public CappuccinoCoffeeCup(Products products) {
        super("Cappuccino", true, products);
    }

    @Override
    public String history() {
        return "A cappuccino is an Italian coffee drink that is traditionally prepared with double espresso, and steamed milk foam. Variations of the drink involve the use of cream instead of milk, and flavouring with cinnamon or chocolate powder. It is typically smaller in volume than a caffè latte, with a thicker layer of micro foam. The name comes from the Capuchin friars, referring to the colour of their habits, and in this context referring to the colour of the beverage when milk is added in small portion to dark, brewed coffee (today mostly espresso). The physical appearance of a modern cappuccino with espresso créma and steamed milk is a result of a long evolution of the drink.";
    }
}
