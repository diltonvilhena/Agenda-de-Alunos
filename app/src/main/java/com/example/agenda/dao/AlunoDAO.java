package com.example.agenda.dao;

import com.example.agenda.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    //inicializa um array estatico de dados
    private final static List<Aluno> alunos = new ArrayList<>();

    //adiciona dados no array
    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

    //retorna uma cópia dos dados do Array
    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
