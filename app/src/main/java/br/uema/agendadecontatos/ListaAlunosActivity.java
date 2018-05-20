package br.uema.agendadecontatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import br.uema.agendadecontatos.dao.AlunoDAO;
import br.uema.agendadecontatos.modelo.Aluno;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos); // seta e guarda as referencias

        AlunoDAO alunoDAO = new AlunoDAO(this);

        List<Aluno> alunos = alunoDAO.buscaAluno();

        //String[] alunos = {"Jhordan", "Jessica", "Alfredo", "Ronaldo", "Jeferson", "Rogério"};
        ListView listaAluno = (ListView) findViewById(R.id.lista_alunos); // obtemos a ferencia de  algum componente criado na view baseado no atributo ID
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos); // adapta objetos para seres mostrados na view
        ArrayAdapter<Aluno> adapter = new ArrayAdapter<Aluno>(this, android.R.layout.simple_list_item_1, alunos); // adapta objetos para seres mostrados na view

        listaAluno.setAdapter(adapter); // seta o adapter para view referenciada

        Button novoAluno = (Button) findViewById(R.id.novo_aluno);
        novoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(intentVaiProFormulario);
            }
        });

    }
}
