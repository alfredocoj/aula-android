package br.uema.agendadecontatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos); // seta e guarda as referencias

        String[] alunos = {"Alfredo", "Ronaldo", "Jeferson"};
        ListView listaAluno = (ListView) findViewById(R.id.lista_alunos); // obtemos a ferencia de  algum componente criado na view baseado no atributo ID
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos); // adapta objetos para seres mostrados na view

        listaAluno.setAdapter(adapter); // seta o adapter para view referenciada

    }
}
