import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import DiceRoller.Roller;
import org.junit.Before;
import org.junit.Test;
public class DiceMatcherTest {

    Roller roller;
    @Before
    public void init(){
        roller = new Roller();
    }

    @Test
    public void testDiceMatcherTrue(){
        assertTrue(roller.diceMatcher("2d6"));
        assertTrue(roller.diceMatcher("1d1"));
        assertTrue(roller.diceMatcher("100d1"));
        assertTrue(roller.diceMatcher("10d97"));
        assertTrue(roller.diceMatcher("100d100"));
    }

    @Test
    public void testDiceMatcherFalse(){
        assertFalse(roller.diceMatcher("0d1"));
        assertFalse(roller.diceMatcher("1d0"));
        assertFalse(roller.diceMatcher("101d6"));
        assertFalse(roller.diceMatcher(""));
        assertFalse(roller.diceMatcher("1da"));}
}



