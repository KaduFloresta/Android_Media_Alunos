package com.example.android_media_alunos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView inputNota1, inputNota2, inputNota3, inputNota4;
    TextView txtResultado;
    private String nome, dtNascimento, endereco, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recebe os "args" em formato String pela chave
        Bundle args = getIntent().getExtras();
        nome = args.getString("nome");
        dtNascimento = args.getString("dtNascimento");
        endereco = args.getString("endereco");
        resultado = args.getString("resultado");

        // Botões para fazer o calculo
        Button btnAdd = (Button) findViewById(R.id.btnMedia);
        btnAdd.setOnClickListener(onClickCalculo());
    }

    // Evento do botão SOMAR
    private View.OnClickListener onClickCalculo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNota1 = (TextView) findViewById(R.id.inputNota1);
                float Nota1 = Float.parseFloat(inputNota1.getText().toString());
                inputNota2 = (TextView) findViewById(R.id.inputNota2);
                float Nota2 = Float.parseFloat(inputNota2.getText().toString());
                inputNota3 = (TextView) findViewById(R.id.inputNota3);
                float Nota3 = Float.parseFloat(inputNota3.getText().toString());
                inputNota4 = (TextView) findViewById(R.id.inputNota4);
                float Nota4 = Float.parseFloat(inputNota4.getText().toString());
                txtResultado = (TextView) findViewById(R.id.txtResultado);
                txtResultado.setText(String.valueOf((Nota1 + Nota2 + Nota3 + Nota4) / 4));

                Intent myIntent = new Intent(MainActivity.this, DataActivity.class);
                startActivityForResult(myIntent, 2);

                Bundle params = new Bundle();
                params.putString("nome", nome);
                params.putString("email", dtNascimento);
                params.putString("usuario", endereco);
                params.putString("senha", resultado);

                myIntent.putExtras(params);
                startActivity(myIntent);
            }
        };
    }
}