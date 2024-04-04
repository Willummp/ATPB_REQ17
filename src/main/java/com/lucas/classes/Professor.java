package com.lucas.classes;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int matricula;
    private String nome;

    private List<Turma> t = new ArrayList<Turma>();

    public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String exibirTurmas() {
        StringBuilder turmasLista = new StringBuilder();
        turmasLista.append("Professor da aula em: ").append(this.nome).append("\n");
        for (Turma turma : t) {
            turmasLista.append("\n > Número da Turma: ").append(turma.getCodigo()).append("\n");
            turmasLista.append("Disciplina: ").append(turma.getDisciplina().getNome()).append("\n");
        }
        return turmasLista.toString();
    }
    public void addTurma(Turma turma) {
        t.add(turma);
    }
}
