package lotr.kickstrategy;

import java.util.Random;

import lotr.Character;

public class NobleKick implements KickStrategy {
    private int min = 0;
    private int max = 0;
    public NobleKick(int min, int max){
        this.min = min;
        this.max = max;
    }
    @Override
    public void kick(Character whoKick, Character whoIsKick) {
        whoKick.setHp(whoKick.getHp() - new Random().nextInt(min, max));
    }
    
}
