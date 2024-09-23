package lotr;

import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class King extends Character {

    public King() {
        super(5, (int) ((Math.random() * (15 - 5)) + 5);, new NobleKick(5, 15));
    }
}
