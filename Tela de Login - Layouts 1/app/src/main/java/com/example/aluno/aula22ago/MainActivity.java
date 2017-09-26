package com.example.aluno.aula22ago;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome, edtTelefone, edtEndereco, edtSite, edtNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtTelefone = (EditText) findViewById(R.id.edtTelefone);
        edtEndereco = (EditText) findViewById(R.id.edtEndereco);
        edtSite = (EditText) findViewById(R.id.edtSitePessoal);
        edtNota = (EditText) findViewById(R.id.edtNota);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CadastroActivity.class);
                it.putExtra("nome", edtNome.getText().toString());
                it.putExtra("telefone", edtTelefone.getText().toString());
                it.putExtra("endereco", edtEndereco.getText().toString());
                it.putExtra("site", edtSite.getText().toString());
                it.putExtra("nota", edtNota.getText().toString());
                startActivity(it);
            }
        });

    }

    public void onClickBtn1(View v) {
        Toast.makeText(this, "Olá Aluno(a) " + edtNome.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
