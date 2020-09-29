package DiceRoller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField diceText;
    @FXML
    private TextField modifierText;
    @FXML
    private TextArea textArea;

    @FXML
    private void rollButtonClick() {
        Roller roller = new Roller();
        textArea.appendText(roller.rollDice(diceText.getText(),modifierText.getText()));
    }

    @FXML
    private void clearButtonClick() {
        textArea.clear();
        textArea.setText("Area Cleared! Keep Rolling!");
    }
}
