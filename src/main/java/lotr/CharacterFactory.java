package lotr;

import java.util.Set;
import org.reflections.Reflections;

public class CharacterFactory {
    public static Character createCharacter(){
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        if (subTypes.isEmpty()) {
            return null;
        }
        int size = subTypes.size();
        int item = new java.util.Random().nextInt(size);
        int i = 0;
        Class<? extends Character> characterClass = null;
        for (Class<? extends Character> clazz : subTypes) {
            if (i == item) {
                characterClass = clazz;
                break;
            }
            i++;
        }
        try {
            return characterClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
