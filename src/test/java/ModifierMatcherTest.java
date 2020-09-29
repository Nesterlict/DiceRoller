import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import DiceRoller.Roller;
import org.junit.Before;
import org.junit.Test;

public class ModifierMatcherTest {

    Roller roller;
    @Before
    public void init(){
        roller = new Roller();
    }

    @Test
    public void testModifierMatcherTrue(){
        assertTrue(roller.modifierMatcher("3"));
        assertTrue(roller.modifierMatcher("-3"));
        assertTrue(roller.modifierMatcher("12323"));
        assertTrue(roller.modifierMatcher("-2323"));
        assertTrue(roller.modifierMatcher("0"));
    }

    @Test
    public void testModifierMatcherFalse(){
        assertFalse(roller.modifierMatcher("as3"));
        assertFalse(roller.modifierMatcher("1-3"));
        assertFalse(roller.modifierMatcher("a2s231"));
        assertFalse(roller.modifierMatcher("-2-"));
        assertFalse(roller.modifierMatcher(""));
    }
}
