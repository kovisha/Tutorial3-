package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public String myExtra1 , myExtra2 ;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.customtoast , (ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL , 0 , 0);
        toast.setView(layout);
        toast.show();

    }

        public void btnOK (View view) {
            btn1 = findViewById(R.id.btnOK);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, secondActivity.class);
                    EditText editText = findViewById(R.id.userinput1);
                    EditText editText2 = findViewById(R.id.userinput2);
                    myExtra1 = editText.getText().toString();
                    myExtra2 = editText2.getText().toString();

                    intent.putExtra("MAIN_EXTRA", myExtra1);
                    intent.putExtra("MAIN_EXTRA2", myExtra2);
                    startActivity(intent);
                }
            });
        }








}