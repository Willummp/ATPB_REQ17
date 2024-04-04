package com.lucas.classes;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int matricula;
    private String nome;
    private List<Turma> turmas = new ArrayList<Turma>();

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void addTurma(Turma turma) {
        turma.addAluno(this);
        turmas.add(turma);
    }

    public String exibirTurmas() {
        StringBuilder turmasLista = new StringBuilder();
        turmasLista.append(" > ").append(this.nome).append("\n");
        for (Turma turma : turmas) {
            turmasLista.append(turma.getNome());
        }
        return turmasLista.toString();
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

}
