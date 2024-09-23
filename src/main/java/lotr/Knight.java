package lotr;

import lotr.kickstrategy.NobleKick;

public class Knight extends Character {

    public Knight() {
        super(5, (int) ((Math.random() * (12 - 2)) + 2), new NobleKick(2, 12));
    }
    
}
