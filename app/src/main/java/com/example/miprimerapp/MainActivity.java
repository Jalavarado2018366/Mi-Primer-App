package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private EditText at1;
    private EditText at2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        at1 = (EditText)findViewById(R.id.txt_Number1 );
        at2 = (EditText)findViewById(R.id.txt_Number2 );
        tv1 = (TextView)findViewById(R.id.txt_resultado);
    }

    // Este metodo realiza la suma
    public void Sumar(View view){
        String valor1 = at1.getText().toString();
        String valor2 = at2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = String.valueOf(suma);
        tv1.setText(result);
    }
    public void Restar(View view){
        String valor1 = at1.getText().toString();
        String valor2 = at2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);


        int restar = num1 - num2;

        String result = String.valueOf(restar);
        tv1.setText(result);
    }
    public void Multiplicar(View view){
        String valor1 = at1.getText().toString();
        String valor2 = at2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int multiplicar = num1 * num2;

        String result = String.valueOf(multiplicar);
        tv1.setText(result);
    }
    public void Dividir(View view){
        String valor1 = at1.getText().toString();
        String valor2 = at2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int dividir = num1 / num2;

        String result = String.valueOf(dividir);
        tv1.setText(result);
    }
}