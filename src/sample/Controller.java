package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    Label label = new Label();
    @FXML
    Label labelResult = new Label();

    private boolean calculationButtonIsChecked = false;

    public void button0(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "0");
    }

    public void button1(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "1");
    }

    public void button2(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "2");
    }

    public void button3(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "3");
    }

    public void button4(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "4");
    }

    public void button5(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "5");
    }

    public void button6(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "6");
    }

    public void button7(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "7");
    }

    public void button8(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "8");
    }

    public void button9(){
        if (labelResult.getText().equals("0") || calculationButtonIsChecked) {
            labelResult.setText("");
            calculationButtonIsChecked = false;
        }
        labelResult.setText(labelResult.getText() + "9");
    }

    public void buttonPlus(){
        if(!labelResult.getText().equals("0") && !calculationButtonIsChecked){
            label.setText(label.getText() + labelResult.getText() +" + ");
            calculationButtonIsChecked = true;
        }
    }

    public void buttonMinus(){

    }

    public void buttonMultiple(){}

    public void buttonDivide(){}

    public void buttonFraction(){}

    public void buttonPlusMinus(){}

    public void buttonBack(){}

    public void buttonsRestart(){}

    public void buttonEquals(){}

}
