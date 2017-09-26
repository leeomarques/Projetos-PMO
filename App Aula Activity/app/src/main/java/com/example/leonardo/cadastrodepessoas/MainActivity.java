package com.example.leonardo.cadastrodepessoas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lista = (ListView) findViewById(R.id.lista);
        List<Pessoa> pessoas = todasAsPessoas();

        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, pessoas);
        lista.setAdapter(adapter);

    }

    private List<Pessoa> todasAsPessoas() {
        return new ArrayList<>(Arrays.asList(
                new Pessoa("Leonardo", "81 1234-54678", EstadoAtual.ATIVO),
                new Pessoa("Marques", "81 99999-9999", EstadoAtual.ATIVO),
                new Pessoa("Abreu", "81 1234-5558", EstadoAtual.INATIVO),
                new Pessoa("Silva", "81 0000-54678", EstadoAtual.ATIVO)
        ));
    }
}
