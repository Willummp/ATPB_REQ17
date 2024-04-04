package com.lucas.classes;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int codigo;
    private String nome;

    private List<Turma> turmas = new ArrayList<Turma>();

public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome + " ";
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public String exibirTurmas() {
        StringBuilder turmasLista = new StringBuilder();
        System.out.println(" > Disciplina: " + this.nome );
        for (Turma turma : turmas) {
            turmasLista.append(turma.getProfessor().getNome()).append("\n");
        }
        return turmasLista.toString();
    }
}
