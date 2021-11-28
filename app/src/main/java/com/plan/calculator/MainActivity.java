package com.plan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1 = findViewById(R.id.ed_number_1);
        EditText num2 = findViewById(R.id.ed_number_2);

        Button btn_add = findViewById(R.id.btn_add);
        Button btn_sub = findViewById(R.id.btn_sub);
        Button btn_mul = findViewById(R.id.btn_mul);
        Button btn_duv = findViewById(R.id.btn_div);

        TextView rez = findViewById(R.id.rez);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                String reez = String.valueOf(number1 + number2);
                rez.setText(reez);
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                String reez = String.valueOf(number1 - number2);
                rez.setText(reez);
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                String reez = String.valueOf(number1 * number2);
                rez.setText(reez);
            }
        });

     btn_duv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString().trim());
                double number2 = Double.parseDouble(num2.getText().toString().trim());
                if (number1 != 0 && number2 != 0) {
                    String reez = String.valueOf(number1 / number2);
                    rez.setText(reez);
                } else {
                    Toast.makeText(MainActivity.this, "Cant", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

