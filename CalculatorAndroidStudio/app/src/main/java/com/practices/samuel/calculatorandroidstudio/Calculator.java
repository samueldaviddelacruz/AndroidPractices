package com.practices.samuel.calculatorandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by samuel on 7/12/16.
 */
public abstract class  Calculator {
   CalculatorElements calcElements;

    protected Calculator(CalculatorElements elements) {
        calcElements = elements;

    }


    public abstract void Add();
    public abstract void SubTract();
    public abstract void Divide();
    public abstract void Multiply();
    public abstract void Clear();

    public EditText getOperand1() {
        return calcElements.Operand1Txt;
    }

    public EditText getOperand2() {
        return calcElements.Operand2Txt;
    }

    public Button getAddition() {
        return calcElements.AdditionButton;
    }

    public Button getSubtraction() {
        return calcElements.SubtractionButton;
    }

    public Button getDivision() {
        return calcElements.DivisionButton;
    }

    public Button getMultiplication() {
        return calcElements.MultiplicationButton;
    }

    public Button getClear() {
        return calcElements.ClearButton;
    }

    public TextView getResult() {
        return calcElements.ResultTxt;
    }
}
