package com.example.agenda;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agenda.dao.AlunoDAO;


public class FormularioAlunoActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoTelefone;
    private EditText campoEmail;
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        setTitle("Novo aluno");
        inicializacaoDosCampos();
        configuraBotaoSalvar();
    }

    private void configuraBotaoSalvar() {
        Button btn_salvar = findViewById(R.id.btn_salvar);
        btn_salvar.setOnClickListener(view -> {
            Aluno alunoCriado = alunoCriado();
            salva(alunoCriado);
        });
    }

    private void inicializacaoDosCampos() {
        campoNome = findViewById(R.id.nome_formulario);
        campoTelefone = findViewById(R.id.telefone_formulario);
        campoEmail = findViewById(R.id.email_formulario);
    }

    private Aluno alunoCriado() {
        String nome = campoNome.getText().toString();
        String telefone = campoTelefone.getText().toString();
        String email = campoEmail.getText().toString();

        return new Aluno(nome, telefone, email);
    }

    private void salva(Aluno aluno) {
        dao.salva(aluno);
        finish();
    }
}