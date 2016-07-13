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
        return calcElements.getOperand1Txt();
    }

    public EditText getOperand2() {
        return calcElements.getOperand2Txt();
    }

    public Button getAddition() {
        return calcElements.getAdditionButton();
    }

    public Button getSubtraction() {
        return calcElements.getSubtractionButton();
    }

    public Button getDivision() {
        return calcElements.getDivisionButton();
    }

    public Button getMultiplication() {
        return calcElements.getMultiplicationButton();
    }

    public Button getClear() {
        return calcElements.getClearButton();
    }

    public TextView getResult() {
        return calcElements.getResultTxt();
    }
}
