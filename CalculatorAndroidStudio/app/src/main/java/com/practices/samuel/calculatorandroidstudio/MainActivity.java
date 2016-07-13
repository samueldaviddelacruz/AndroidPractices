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

    private EditText operand1;
    private EditText operand2;
    private Button Addition;
    private Button Subtraction;
    private Button Division;
    private Button Multiplication;
    private Button Clear;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText)findViewById(R.id.editOperand2);
        Addition = (Button) findViewById(R.id.Addition);
        Subtraction = (Button) findViewById(R.id.Subtraction);
        Division = (Button) findViewById(R.id.Division);
        Multiplication = (Button) findViewById(R.id.Multiplication);
        Clear = (Button) findViewById(R.id.Clear);
        Result = (TextView) findViewById(R.id.Result);
        CalculatorElements elements = new CalculatorElements(Result,operand1,operand2,Addition,Subtraction,Division,Multiplication,Clear);
        SimpleCalculator.Make(MainActivity.this,elements);

    }
}
