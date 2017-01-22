package com.example.james.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.james.calculator.MainActivity.RESULT;

public class ResultActivity extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String result = getIntent().getStringExtra(RESULT);

        tvResult = (TextView) findViewById(R.id.tv_result);
        tvResult.setText(result);
    }
}
