package com.practices.samuel.calculatorandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Operand1Txt;
    private EditText Operand2Txt;
    private Button AdditionButton;
    private Button SubtractionButton;
    private Button DivisionButton;
    private Button MultiplicationButton;
    private Button ClearButton;
    private TextView ResultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Operand1Txt = (EditText) findViewById(R.id.editOperand1);
        Operand2Txt = (EditText)findViewById(R.id.editOperand2);
        AdditionButton = (Button) findViewById(R.id.Addition);
        SubtractionButton = (Button) findViewById(R.id.Subtraction);
        DivisionButton = (Button) findViewById(R.id.Division);
        MultiplicationButton = (Button) findViewById(R.id.Multiplication);
        ClearButton = (Button) findViewById(R.id.Clear);
        ResultTxt = (TextView) findViewById(R.id.Result);
        CalculatorElements elements = new CalculatorElements(Operand1Txt,Operand2Txt,AdditionButton,SubtractionButton,DivisionButton,MultiplicationButton,ClearButton,ResultTxt);
        SimpleCalculator.Make(MainActivity.this,elements);

    }
}
