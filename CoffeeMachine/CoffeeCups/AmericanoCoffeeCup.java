package vcs.CoffeeMachine.CoffeeCups;

import vcs.CoffeeMachine.*;

public class AmericanoCoffeeCup extends CoffeeCup {

    public AmericanoCoffeeCup(Products products) {
        super("Americano", true, products);
    }

    @Override
    public String history() {
        return "Caffè Americano or Americano is a type of coffee drink prepared by diluting an espresso with hot water, giving it a similar strength to, but different flavor from traditionally brewed coffee. The strength of an Americano varies with the number of shots of espresso and the amount of water added. The name is also spelled with varying capitalization and use of diacritics: e.g., café americano.";
    }
}
