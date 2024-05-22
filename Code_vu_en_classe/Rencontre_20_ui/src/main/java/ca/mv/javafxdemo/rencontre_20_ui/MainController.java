package ca.mv.javafxdemo.rencontre_20_ui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.security.InvalidAlgorithmParameterException;

public class MainController {
//    @FXML
//    private Label btnText;

    @FXML
    private TextField resultatCalcul;

    private int operand1 = 0;
    private int operand2 = 0;
    private char operation;

    private int resultat = 0;

    @FXML
    protected void onClickBtnClick(ActionEvent event) throws InvalidAlgorithmParameterException {
        Button button = (Button) event.getSource();
        if(button.getText() == null || button.getText().length() == 0)
            return;
        char textBtn = button.getText().charAt(0);
        if (textBtn == '=') {
            calculate();
        } else {
            resultatCalcul.setText(!resultatCalcul.getText().equals("0")
                    ? resultatCalcul.getText() + textBtn
                    : textBtn + "");
            if (estNombre(textBtn)) {
                if(operation == '\0') {
                    operand1 *= 10;
                    operand1 += Character.digit(textBtn, 10);
                } else {
                    operand2 *= 10;
                    operand2 += Character.digit(textBtn, 10);
                }
            } else  if (textBtn == '<') {
                reinitialize();
            } else {
                operation = textBtn;
            }
        }
/*        if(btnText.isVisible()) {
            btnText.setVisible(false);
        }else{
            btnText.setVisible(true);
        }*/
    }

    private void reinitialize() {
        resultatCalcul.setText("0");
        operand1 = 0;
        operand2 = 0;
        operation = '\0';
        resultat = 0;
    }

    private void calculate() throws InvalidAlgorithmParameterException {
        resultat = 0;
        switch (operation){
            case '+':
                resultat = operand1 + operand2;
                break;
            case '-':
                resultat = operand1 - operand2;
                break;
            case '*':
                resultat = operand1 * operand2;
                break;
            case '/':
                resultat = operand1 / operand2;
                break;
            default:
                throw new InvalidAlgorithmParameterException();
        }
        resultatCalcul.setText(resultat + "");
    }

    private static boolean estNombre(char caract){
        return Character.isDigit(caract);
    }
}
