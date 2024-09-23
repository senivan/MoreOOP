package lotr.kickstrategy;

import lotr.Character;

public class HobbitKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKick) {
        System.out.println("kick");
    }
    
}
