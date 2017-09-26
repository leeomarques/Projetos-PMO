package com.example.aluno.aula22ago;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Intent it = getIntent();

        String nome = it.getStringExtra("nome");
        String telefone = it.getStringExtra("telefone");
        String endereco = it.getStringExtra("endereco");
        String site = it.getStringExtra("site");
        String nota = it.getStringExtra("nota");

        TextView tvNome = (TextView) findViewById(R.id.nome);
        tvNome.setText(nome);
        TextView tvTelefone = (TextView) findViewById(R.id.telefone);
        tvTelefone.setText(telefone);
        TextView tvEndereco = (TextView) findViewById(R.id.endereco);
        tvEndereco.setText(endereco);
        TextView tvSite = (TextView) findViewById(R.id.site);
        tvSite.setText(site);
        TextView tvNota = (TextView) findViewById(R.id.nota);
        tvNota.setText(nota);

    }
}
