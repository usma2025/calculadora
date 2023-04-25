package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1Edit, num2Edit, textResultado;
    Button btn_sumar,btn_restar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1Edit = findViewById(R.id.editTexNumber1);
        num2Edit = findViewById(R.id.editTextNumber2);

        btn_sumar = findViewById(R.id.btn_sumar);
        btn_restar = findViewById(R.id.btn_restar);

        textResultado = findViewById(R.id.TextResultado);




        btn_sumar.setOnClickListener(v -> {
            int num1 = Integer.parseInt(num1Edit.getText().toString());
            int num2 = Integer.parseInt(num2Edit.getText().toString());
            sumarBtn(num1,num2);
        });

        btn_restar.setOnClickListener(v -> {
            int num1 = Integer.parseInt(num1Edit.getText().toString());
            int num2 = Integer.parseInt(num2Edit.getText().toString());
            restarBtn(num1,num2);

        });

    }

    public int restarBtn(int num1, int num2) {

        int res= num1 +num2;



        textResultado.setText(String.valueOf(res));

        return res;
    }

    public int sumarBtn(int num1, int num2) {

        int res= num1 +num2;


        textResultado.setText(String.valueOf(res));

        return res;
    }
}