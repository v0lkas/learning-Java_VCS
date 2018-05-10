package vcs.CoffeeMachine.CoffeeCups;

import vcs.CoffeeMachine.*;

public class EspressoCoffeeCup extends CoffeeCup {

    public EspressoCoffeeCup(Products products) {
        super("Espresso", true, products);
    }

    @Override
    public String history() {
        return "Espresso is coffee brewed by expressing or forcing out a small amount of nearly boiling water under pressure through finely ground coffee beans. Espresso is generally thicker than coffee brewed by other methods, has a higher concentration of suspended and dissolved solids, and has crema on top (a foam with a creamy consistency). As a result of the pressurized brewing process, the flavors and chemicals in a typical cup of espresso are very concentrated. Espresso is also the base for other drinks such as a caffè latte, cappuccino, caffè macchiato, caffè mocha, flat white, or caffè Americano.";
    }
}
