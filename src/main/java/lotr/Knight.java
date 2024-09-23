package lotr;

import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class Knight extends Character {

    public Knight() {
        super(5, new Random().nextInt(2, 12), new NobleKick(2, 12));
    }
    
}
