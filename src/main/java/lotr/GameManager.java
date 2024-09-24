package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2){
        System.out.println("A fight between " + c1 + " and " + c2 + " has started!");
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1 + " kicked " + c2 + "!");
            System.out.println(c2 + " has " + c2.getHp() + " health points left!");
            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.println(c2 + " kicked " + c1 + "!");
                System.out.println(c1 + " has " + c1.getHp() + " health points left!");
            }
        }
    }
}
