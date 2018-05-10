package vcs.CoffeeMachine.CoffeeCups;

import vcs.CoffeeMachine.*;

public class LatteCoffeeCup extends CoffeeCup {

    public LatteCoffeeCup(Products products) {
        super("Latte", true, products);
    }

    @Override
    public String history() {
        return "A latte is a coffee drink made with espresso and steamed milk. The term as used in English is a shortened form of the Italian caffè latte or caffellatte, which means \"milk coffee\". The word is also sometimes spelled latté or lattè in English with different kinds of accent marks, which can be a hyperforeignism or a deliberate attempt to indicate that the word is not pronounced according to the rules of English orthography. In northern Europe and Scandinavia the term café au lait has traditionally been used for the combination of espresso and milk. In France, caffè latte is mostly known from the original Italian name of the drink (caffè latte or caffelatte); a combination of espresso and steamed milk equivalent to a \"latte\" is in French called grand crème and in German Milchkaffee or (in Austria) Wiener Melange.";
    }

}
