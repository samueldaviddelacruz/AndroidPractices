package com.practices.samuel.calculatorandroidstudio;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Samuel on 7/12/2016.
 */
public class CalculatorElements {

    public CalculatorElements(EditText operand1Txt, EditText operand2Txt, Button additionButton, Button subtractionButton, Button divisionButton, Button multiplicationButton, Button clearButton, TextView resultTxt) {
        Operand1Txt = operand1Txt;
        Operand2Txt = operand2Txt;
        AdditionButton = additionButton;
        SubtractionButton = subtractionButton;
        DivisionButton = divisionButton;
        MultiplicationButton = multiplicationButton;
        ClearButton = clearButton;
        ResultTxt = resultTxt;
    }

    public EditText Operand1Txt;
    public EditText Operand2Txt;
    public Button AdditionButton;
    public Button SubtractionButton;
    public Button DivisionButton;
    public Button MultiplicationButton;
    public Button ClearButton;
    public TextView ResultTxt;


}
