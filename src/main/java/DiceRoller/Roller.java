package DiceRoller;

import java.util.Random;

public class Roller {


    public String rollDice (String diceCombination, String modifier) {
        Roller roller = new Roller();
        if (roller.diceMatcher(diceCombination) && roller.modifierMatcher(modifier)){
            String[] parts = diceCombination.toLowerCase().split("d");
            int leftPart = Integer.parseInt(parts[0]);
            int rightPart = Integer.parseInt(parts[1]);
            int sum = Integer.parseInt(modifier);
            Random r = new Random();
            String result ="";
            for (int i = 0; i<leftPart; i++) {
                int diceThrow = (r.nextInt(rightPart) + 1);
                result += diceThrow + ",";
                sum += diceThrow;
            }
            String total = "(" + result + ")" + modifier + "=" + sum;
            return  "\n" + roller.removeComma(total);
        }
        else return "\n" + "An error has occurred. Please correct input data!";
    }

    public String removeComma(String total) {
        StringBuilder builder = new StringBuilder(total);
        int lastComma = total.lastIndexOf(',');
        builder.deleteCharAt(lastComma);
        return builder.toString();
    }

    public Boolean diceMatcher (String diceCombination) {
        String regex = "\\b([1-9]|[1-9][0-9]|100)[dD]([1-9]|[1-9][0-9]|100)\\b";
        return diceCombination.matches(regex);
    }

    public Boolean modifierMatcher (String modifier){
        try {
            Integer.parseInt(modifier);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }
}
