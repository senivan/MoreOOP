package lotr;

import lotr.kickstrategy.HobbitKick;

public class Hobbit extends Character {
    public Hobbit(){
        super(0, 3, new HobbitKick());
    }
    @Override
    public void kick(Character c) {
       System.out.println("Kick");
    }

}
