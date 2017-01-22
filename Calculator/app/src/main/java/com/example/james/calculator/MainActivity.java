package com.example.james.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String RESULT = "result";
    private EditText edtFirstNumber;
    private EditText edtSecondNumber;
    int firstNumber;
    int secondNumber;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial();
    }

    private void initial() {
        calculator = new Calculator();
        edtFirstNumber = (EditText) findViewById(R.id.edt_firstNumber);
        edtSecondNumber = (EditText) findViewById(R.id.edt_secondNumber);
    }

    public void plus(View view) {
        //business logic
        setupInput();
        sendResult(calculator.plus(firstNumber, secondNumber));
    }

    private void setupInput() {
        firstNumber = Integer.valueOf(edtFirstNumber.getText().toString());
        secondNumber = Integer.valueOf(edtSecondNumber.getText().toString());
    }

    public void minus(View view) {
        //business logic
        setupInput();
        sendResult(calculator.minus(firstNumber, secondNumber));
    }

    private void sendResult(int result) {
        //Send result
        sendResult(String.valueOf(result));
    }

    public void divide(View view) {
        //business logic
        setupInput();
        try {
            int result = calculator.divide(firstNumber, secondNumber);
            sendResult(result);
        } catch (DividedByZeroException e){
            sendResult("หาร 0 ไม่ได้นะ");
        }
    }

    private void sendResult(String result) {
        //Send result
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(RESULT, result);
        startActivity(intent);
    }
}
