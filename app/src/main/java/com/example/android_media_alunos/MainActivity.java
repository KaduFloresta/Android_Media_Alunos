package com.example.android_media_alunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nota1, nota2, nota3, nota4;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculo = (Button) findViewById(R.id.btnCalculo);
        btnCalculo.setOnClickListener(onClickCalcular());
    }

    // Evento do botão para INSERIR dados e CALCULAR as médias
    private View.OnClickListener onClickCalcular() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nota1 = (TextView) findViewById(R.id.inputNota1);
                nota2 = (TextView) findViewById(R.id.inputNota2);
                nota3 = (TextView) findViewById(R.id.inputNota3);
                nota4 = (TextView) findViewById(R.id.inputNota4);
                float tNota1 = Float.parseFloat(nota1.getText().toString());
                float tNota2 = Float.parseFloat(nota2.getText().toString());
                float tNota3 = Float.parseFloat(nota3.getText().toString());
                float tNota4 = Float.parseFloat(nota4.getText().toString());
                resultado = (TextView) findViewById(R.id.dataResultado);
                resultado.setText(String.valueOf((tNota1 + tNota2 + tNota3 + tNota4) / 4));
            }
        };
    }
}