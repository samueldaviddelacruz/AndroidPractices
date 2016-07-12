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
        new SimpleCalculator(MainActivity.this);

    }
}
