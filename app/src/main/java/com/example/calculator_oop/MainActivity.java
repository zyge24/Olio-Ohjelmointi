package com.example.calculator_oop;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private EditText number1Input;
    private EditText number2Input;
    private TextView resultField;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Input = findViewById(R.id.inputNumber1);
        number2Input = findViewById(R.id.inputNumber2);
        resultField = findViewById(R.id.resultField);
    }
    public void plus(View view) {
        result = Integer.parseInt(number1Input.getText().toString()) + Integer.parseInt(number2Input.getText().toString());
        StringBuilder sb = new StringBuilder(number1Input.getText().toString() + " + " +number2Input.getText().toString() + " = " + Integer.toString(result));
//       System.out.println(result);
        resultField.setText(sb.toString());
    }
    public void subs(View view) {
        result = Integer.parseInt(number1Input.getText().toString()) - Integer.parseInt(number2Input.getText().toString());
        StringBuilder sb = new StringBuilder(number1Input.getText().toString() + " - " +number2Input.getText().toString() + " = " + Integer.toString(result));
//     System.out.println(result);
        resultField.setText(sb.toString());
    }
    public void divide(View view) {
        result = Integer.parseInt(number1Input.getText().toString()) / Integer.parseInt(number2Input.getText().toString());
        StringBuilder sb = new StringBuilder(number1Input.getText().toString() + " / " +number2Input.getText().toString() + " = " + Integer.toString(result));
//        System.out.println(result);
        resultField.setText(sb.toString());
    }
    public void multiply(View view) {
        result = Integer.parseInt(number1Input.getText().toString()) * Integer.parseInt(number2Input.getText().toString());
        StringBuilder sb = new StringBuilder(number1Input.getText().toString() + " * " +number2Input.getText().toString() + " = " + Integer.toString(result));
//        System.out.println(result);
        resultField.setText(sb.toString());
    }
}