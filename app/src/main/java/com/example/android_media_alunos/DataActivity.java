package com.example.android_media_alunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private String nome, dtNascimento, endereco, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

//        Bundle args = getIntent().getExtras();
//        nome = args.getString("nome");
//        dtNascimento = args.getString("nascimento");
//        endereco = args.getString("endereco");
//        resultado = args.getString("resultado");
//
//        TextView dataNome = (TextView) findViewById(R.id.dataNome);
//        dataNome.setText("Nome: " + nome);
//        TextView dataDtNascimento = (TextView) findViewById(R.id.dataDtNascimento);
//        dataDtNascimento.setText("Data Nascimento: " + dtNascimento);
//        TextView dadosEndereco = (TextView) findViewById(R.id.dadosEndereco);
//        dadosEndereco.setText("Endereço: " + endereco);
//        TextView dataResultado = (TextView) findViewById(R.id.dataResultado1);
//        dataResultado.setText(resultado);
    }
}