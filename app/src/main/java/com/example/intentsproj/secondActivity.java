package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    String takeExtra , takeExtra2 , Out1 , Out2 , Out3 , Out4 , Out5 , Out6 , Out7 , Out8;
    TextView tv , tv1;
    Button add , sub , multi , divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent myIntent = getIntent();

        takeExtra = myIntent.getStringExtra("MAIN_EXTRA");
        takeExtra2 = myIntent.getStringExtra("MAIN_EXTRA2");

         tv = findViewById(R.id.intake1);
         tv1 = findViewById(R.id.intake2);
        tv.setText(takeExtra);
        tv1.setText(takeExtra2);


    }

    public void addData(View view){

        add = findViewById(R.id.addbtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText eOut1 = findViewById(R.id.intake1);
                EditText eOut2 = findViewById(R.id.intake2);

                Out1 = eOut1.getText().toString();
                Out2 = eOut2.getText().toString();

                Integer i1 = Integer.parseInt(Out1);
                Integer i2 = Integer.parseInt(Out2);

                String result = "";

                result = i1 + "+" + i2 + "=" + (i1+i2);

                TextView tvResult = findViewById(R.id.result);
                tvResult.setText(result);
            }
        });

    }

    public void subData(View view){
        sub = findViewById(R.id.subbtn);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText eOut3 = findViewById(R.id.intake1);
                EditText eOut4 = findViewById(R.id.intake2);

                Out3 = eOut3.getText().toString();
                Out4 = eOut4.getText().toString();

                Integer i3 = Integer.parseInt(Out3);
                Integer i4 = Integer.parseInt(Out4);

                String result2 = "";

                result2 =  i3 + "-" + i4 + "=" + (i3-i4);

                TextView subResult = findViewById(R.id.result);
                subResult.setText(result2);

            }
        });

    }

    public void multiData(View view){
        multi = findViewById(R.id.multibtn);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText eOut5 = findViewById(R.id.intake1);
                EditText eOut6 = findViewById(R.id.intake2);

                Out5 = eOut5.getText().toString();
                Out6 = eOut6.getText().toString();

                Integer i5 = Integer.parseInt(Out5);
                Integer i6 = Integer.parseInt(Out6);

                String result3 = "";

                result3 = i5 + "*" + i6 + "=" + (i5*i6);

                TextView multiResult = findViewById(R.id.result);
                multiResult.setText(result3);

            }
        });
    }


    public void divideDate(View view){

        divide = findViewById(R.id.btndivide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText eOut7 = findViewById(R.id.intake1);
                EditText eOut8 = findViewById(R.id.intake2);

                Out7 = eOut7.getText().toString();
                Out8 = eOut8.getText().toString();

                Integer i7 = Integer.parseInt(Out7);
                Integer i8 = Integer.parseInt(Out8);

                String result4 = "";

                result4 = i7  + "/" + i8 + "=" + (i7/i8);

                TextView divideResult = findViewById(R.id.result);
                divideResult.setText(result4);

            }
        });
    }

}