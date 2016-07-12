package com.practices.samuel.calculatorandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by samuel on 7/12/16.
 */
public abstract class  Calculator {
    private EditText operand1;
    private EditText operand2;
    private Button Addition;
    private Button Subtraction;
    private Button Division;
    private Button Multiplication;
    private Button Clear;
    private TextView Result;

    protected Calculator(AppCompatActivity context) {
        operand1 = (EditText) context.findViewById(R.id.editOperand1);
        operand2 = (EditText) context.findViewById(R.id.editOperand2);
        Addition = (Button) context.findViewById(R.id.Addition);
        Subtraction = (Button) context.findViewById(R.id.Subtraction);
        Division = (Button) context.findViewById(R.id.Division);
        Multiplication = (Button) context.findViewById(R.id.Multiplication);
        Clear = (Button) context.findViewById(R.id.Clear);
        Result = (TextView) context.findViewById(R.id.Result);
    }


    public abstract void Add();
    public abstract void SubTract();
    public abstract void Divide();
    public abstract void Multiply();
    public abstract void Clear();

    public EditText getOperand1() {
        return operand1;
    }

    public EditText getOperand2() {
        return operand2;
    }

    public Button getAddition() {
        return Addition;
    }

    public Button getSubtraction() {
        return Subtraction;
    }

    public Button getDivision() {
        return Division;
    }

    public Button getMultiplication() {
        return Multiplication;
    }

    public Button getClear() {
        return Clear;
    }

    public TextView getResult() {
        return Result;
    }
}
