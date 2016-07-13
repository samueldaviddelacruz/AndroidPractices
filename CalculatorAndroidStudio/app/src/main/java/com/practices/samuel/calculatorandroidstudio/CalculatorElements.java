package com.practices.samuel.calculatorandroidstudio;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Samuel on 7/12/2016.
 */
public class CalculatorElements {

    public CalculatorElements(TextView resultTxt,
                              EditText operand1Txt,
                              EditText operand2Txt,
                              Button additionButton,
                              Button subtractionButton,
                              Button divisionButton,
                              Button multiplicationButton,
                              Button clearButton) {
        setResultTxt(resultTxt);
        setOperand1Txt(operand1Txt);
        setOperand2Txt(operand2Txt);
        setAdditionButton(additionButton);
        setSubtractionButton(subtractionButton);
        setDivisionButton(divisionButton);
        setMultiplicationButton(multiplicationButton);
        setClearButton(clearButton);
    }
    private EditText Operand1Txt;
    private EditText Operand2Txt;
    private Button AdditionButton;
    private Button SubtractionButton;;
    private Button DivisionButton;
    private Button MultiplicationButton;
    private Button ClearButton;
    private TextView ResultTxt;


    public EditText getOperand1Txt() {
        return Operand1Txt;
    }

    public void setOperand1Txt(EditText operand1Txt) {
        Operand1Txt = operand1Txt;
    }

    public EditText getOperand2Txt() {
        return Operand2Txt;
    }

    public void setOperand2Txt(EditText operand2Txt) {
        Operand2Txt = operand2Txt;
    }

    public Button getAdditionButton() {
        return AdditionButton;
    }

    public void setAdditionButton(Button additionButton) {
        AdditionButton = additionButton;
    }

    public Button getSubtractionButton() {
        return SubtractionButton;
    }

    public void setSubtractionButton(Button subtractionButton) {
        SubtractionButton = subtractionButton;
    }

    public Button getDivisionButton() {
        return DivisionButton;
    }

    public void setDivisionButton(Button divisionButton) {
        DivisionButton = divisionButton;
    }

    public Button getMultiplicationButton() {
        return MultiplicationButton;
    }

    public void setMultiplicationButton(Button multiplicationButton) {
        MultiplicationButton = multiplicationButton;
    }

    public Button getClearButton() {
        return ClearButton;
    }

    public void setClearButton(Button clearButton) {
        ClearButton = clearButton;
    }

    public TextView getResultTxt() {
        return ResultTxt;
    }

    public void setResultTxt(TextView resultTxt) {
        ResultTxt = resultTxt;
    }
}
