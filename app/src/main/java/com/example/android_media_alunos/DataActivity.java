package com.example.android_media_alunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private String nome, dtNascimento, endereco, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Bundle args = getIntent().getExtras();
        nome = args.getString("nome");
        dtNascimento = args.getString("dtNascimento");
        endereco = args.getString("endereco");
        resultado = args.getString("resultado");

        TextView txtInfoNome = (TextView) findViewById(R.id.txtInfoNome);
        txtInfoNome.setText("Nome: " + nome);
        TextView txtInfoDtNascimento = (TextView) findViewById(R.id.txtInfoDtNascimento);
        txtInfoDtNascimento.setText("Data de Nascimento: " + dtNascimento);
        TextView txtInfoEndereco = (TextView) findViewById(R.id.txtInfoEndereco);
        txtInfoEndereco.setText("Endereço: " + endereco);
        TextView txtInfoResultado = (TextView) findViewById(R.id.txtInfoResultado);
        txtInfoResultado.setText("Média: " + resultado);
    }
}