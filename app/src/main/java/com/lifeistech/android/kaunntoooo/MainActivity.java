package com.lifeistech.android.kaunntoooo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int num;
    TextView num_text;
    Button addition,subtraction,division,multiplication,reset;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_text = (TextView)findViewById(R.id.num_text);
        num_text.setText("0");
        num = 0;

        addition = (Button)findViewById(R.id.addition);
        addition.setOnClickListener(this);
        subtraction = (Button)findViewById(R.id.subtraction);
        subtraction.setOnClickListener(this);
        division = (Button)findViewById(R.id.division);
        division.setOnClickListener(this);
        multiplication = (Button)findViewById(R.id.multiplication);
        multiplication.setOnClickListener(this);
        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addition:
                num++;
                num_text.setText(String.valueOf(num));
                break;
            case R.id.subtraction:
                num--;
                num_text.setText(num + "");
                break;
            case R.id.division:
                num /= 2;
                num_text.setText(num + "");
                break;
            case R.id.multiplication:
                num *= 2;
                num_text.setText(num + "");
                break;
            case R.id.reset:
                num = 0;
                num_text.setText(num + "");
            default:
                break;
        }
    }

}
