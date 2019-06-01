package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    Label label = new Label();
    @FXML
    Label labelResult = new Label();

    private boolean notAllowedClickBack = false;
    private byte operation = 0;
    private double num = 0;
    private double result = 0;

    private void choiceOperation(){
        switch (operation){
            case (1):
                result = result + num;
                break;
            case (2):
                result = result - num;
                break;
            case (3):
                result = result * num;
                break;
            case (4):
                result = result / num;
                break;
                default:
                    break;
        }
    }

    public void button0(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "0");
    }

    public void button1(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
            labelResult.setText(labelResult.getText() + "1");

    }

    public void button2(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "2");
    }

    public void button3(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "3");
    }

    public void button4(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "4");
    }

    public void button5(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "5");
    }

    public void button6(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "6");
    }

    public void button7(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "7");
    }

    public void button8(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "8");
    }

    public void button9(){
        notAllowedClickBack = false;
        if(labelResult.getText().equals("0")){
            labelResult.setText("");
        }
        labelResult.setText(labelResult.getText() + "9");
    }

    public void buttonPlus(){
        notAllowedClickBack = false;
        if(label.getText().equals("")){
            label.setText(labelResult.getText() + " + ");
            result = Double.parseDouble(labelResult.getText());
            labelResult.setText("");
            operation = 1;
        }

        if(!labelResult.getText().equals("0")  && !labelResult.getText().equals("") && !label.getText().equals("")) {
            num = Double.parseDouble(labelResult.getText());
            choiceOperation();
            label.setText(label.getText() + labelResult.getText() + " + ");
            labelResult.setText("0");

            num = Double.parseDouble(labelResult.getText());
            operation = 1;
            choiceOperation();
            //
            labelResult.setText("");
        }

        System.out.println(result);
    }

    public void buttonMinus(){
        notAllowedClickBack = false;
        if(label.getText().equals("")){
            label.setText(labelResult.getText() + " - ");
            result = Double.parseDouble(labelResult.getText());
            labelResult.setText("");
            operation = 2;
        }

        if(!labelResult.getText().equals("0")  && !labelResult.getText().equals("") && !label.getText().equals("")) {
            num = Double.parseDouble(labelResult.getText());
            choiceOperation();
            label.setText(label.getText() + labelResult.getText() + " - ");
            labelResult.setText("0");

            num = Double.parseDouble(labelResult.getText());
            operation = 2;
            choiceOperation();
            //
            labelResult.setText("");
        }
        System.out.println(result);
    }

    public void buttonMultiple(){
        notAllowedClickBack = false;
        if(label.getText().equals("")){
            label.setText(labelResult.getText() + " * ");
            result = Double.parseDouble(labelResult.getText());
            labelResult.setText("");
            operation = 3;
        }

        if(!labelResult.getText().equals("0")  && !labelResult.getText().equals("") && !label.getText().equals("")) {
            num = Double.parseDouble(labelResult.getText());
            choiceOperation();
            label.setText(label.getText() + labelResult.getText() + " * ");
            labelResult.setText("0");

            num = Double.parseDouble(labelResult.getText());
            operation = 3;
            if (num == 0){
                num = 1;
            }
            choiceOperation();
            //
            labelResult.setText("");
        }
        System.out.println(result);
    }

    public void buttonDivide(){
        notAllowedClickBack = false;
        if(label.getText().equals("")){
            label.setText(labelResult.getText() + " / ");
            result = Double.parseDouble(labelResult.getText());
            labelResult.setText("");
            operation = 4;
        }

        if(!labelResult.getText().equals("0")  && !labelResult.getText().equals("") && !label.getText().equals("")) {
            num = Double.parseDouble(labelResult.getText());
            choiceOperation();
            label.setText(label.getText() + labelResult.getText() + " / ");
            labelResult.setText("0");

            num = Double.parseDouble(labelResult.getText());
            operation = 4;
            if (num == 0){
                num = 1;
            }
            choiceOperation();
            labelResult.setText("");
        }
        System.out.println(result);
    }

    public void buttonFraction(){
        notAllowedClickBack = false;
        labelResult.setText(labelResult.getText() + ".");
    }

    public void buttonPlusMinus(){
        notAllowedClickBack = false;
        if(!labelResult.getText().equals("0")){
            double a = Double.parseDouble(labelResult.getText()) * -1;
            labelResult.setText(String.valueOf(a));
        }
    }

    public void buttonBack(){
        if (!labelResult.getText().equals("0") && !labelResult.getText().equals("") && !notAllowedClickBack){
            labelResult.setText(labelResult.getText().substring(0, labelResult.getText().length() - 1));
        }
    }

    public void buttonsRestart(){
        label.setText("");
        labelResult.setText("0");
        operation = 0;
        result = 0;
        num = 0;
    }

    public void buttonEquals(){
        notAllowedClickBack = true;
        if(!labelResult.getText().equals("0")  && !labelResult.getText().equals("") && !(operation == 0)){
            num = Double.parseDouble(labelResult.getText());
            choiceOperation();
            labelResult.setText(String.valueOf(result));
            result = 0;
            label.setText("");
            operation = 0;
        }
    }

}
