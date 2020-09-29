import DiceRoller.Roller;
import org.junit.Before;
import org.junit.Test;

public class RollDiceTest {

    Roller roller;

    @Before
    public void init(){
        roller = new Roller();
    }

    @Test
    public void testRollDice(){
        System.out.println(roller.rollDice("10d12","-12"));
        System.out.println(roller.rollDice("0d12","1"));
        System.out.println(roller.rollDice("1d1","a"));
    }
}
