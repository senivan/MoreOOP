package lotr.kickstrategy;

import lotr.Character;

public class ElfKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKick) {
        whoKick.setHp(whoKick.getHp() - whoIsKick.getPower());
    }
    
}
