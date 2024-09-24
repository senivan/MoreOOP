import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import lotr.CharacterFactory;
import lotr.GameManager;
import lotr.Character;

class DemoTest {
    @Test
    void demoTest() {
        assertEquals("hello", "hello");
        Character character = CharacterFactory.createCharacter();
        assertNotNull(character);
        assertEquals(character.toString(), character.toString()); 
        GameManager.fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }
}