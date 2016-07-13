package com.practices.samuel.calculatorandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by samuel on 7/12/16.
 */
public class SimpleCalculator extends Calculator {

    double inputValue1 = 0;
    double inputValue2 = 0;
    AppCompatActivity Activitycontext;

    private SimpleCalculator(AppCompatActivity context,CalculatorElements elements) {
        super(elements);
        Activitycontext = context;
        addListeners();
    }

    private void addListeners() {
        addOnAdditionListener();
        addOnSubtractionListener();
        addOnDivisionListener();
        addOnMultiplyListener();
        addOnClearListener();
    }

    public static void Make(AppCompatActivity context,CalculatorElements elements){

        new SimpleCalculator(context,elements);
    }

    private void addOnAdditionListener() {
        getAddition().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (OperandInputsAreValid()) {
                    getValuesFromOperandInputs();
                    Add();
                } else {

                    Toast.makeText(Activitycontext, "please enter  numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }

        });

    }

    private void addOnSubtractionListener() {
        getSubtraction().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (OperandInputsAreValid()) {
                    getValuesFromOperandInputs();
                    SubTract();

                } else {

                    Toast.makeText(Activitycontext, "please enter  numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void addOnDivisionListener() {
        getDivision().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (OperandInputsAreValid()) {
                    getValuesFromOperandInputs();
                    Divide();
                } else {

                    Toast.makeText(Activitycontext, "please enter  numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void addOnMultiplyListener() {
        getMultiplication().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (OperandInputsAreValid()) {
                    getValuesFromOperandInputs();
                    Multiply();

                } else {

                    Toast.makeText(Activitycontext, "please enter  numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void addOnClearListener() {
        getClear().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();

            }
        });

    }

    private boolean OperandInputsAreValid() {
        return getOperand1().getText().length() > 0 && getOperand2().getText().length() > 0;
    }

    private void getValuesFromOperandInputs() {
        inputValue1 = Double.parseDouble(getOperand1().getText().toString());
        inputValue2 = Double.parseDouble(getOperand2().getText().toString());
    }
    @Override
    public void Add() {
        double result = inputValue1 + inputValue2;
        getResult().setText(Double.toString(result));

    }

    @Override
    public void SubTract() {
        double result = inputValue1 - inputValue2;
        getResult().setText(Double.toString(result));
    }

    @Override
    public void Divide() {
        double result = inputValue1 / inputValue2;
        getResult().setText(Double.toString(result));
    }

    @Override
    public void Multiply() {
        double result = inputValue1 * inputValue2;
        getResult().setText(Double.toString(result));
    }

    @Override
    public void Clear() {

        getOperand1().setText("");
        getOperand2().setText("");
        getResult().setText("0.00");
        getOperand1().requestFocus();
    }


}
