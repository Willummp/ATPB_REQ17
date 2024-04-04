package com.lucas.classes;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private List<Aluno> alunos = new ArrayList<>();
    private Disciplina disciplina;
    private Professor professor;

    private static final int MAX_ALUNOS = 10;
    private static final int MIN_ALUNOS = 2;

    public Turma(int codigo) {
        this.codigo = codigo;
    }

    public String addAluno(Aluno aluno) {
        alunos.add(aluno);
        return "Aluno: " + aluno.getNome() + " adicionado!";
    }

    public boolean abrirTurma() {
        if (alunos.size() >= MIN_ALUNOS && alunos.size() <= MAX_ALUNOS) {
            return true;
        }
        return false;
    }

public String gerarPauta() {
    StringBuilder pauta = new StringBuilder();
    pauta.append(" > > Pauta da Turma: ").append(this.codigo).append("\n");
    pauta.append("Disciplina: ").append(this.disciplina.getNome()).append("\n");
    pauta.append("Professor: ").append(this.professor.getNome()).append("\n");
    pauta.append(" > Lista de Alunos:\n");
    for (Aluno aluno : this.alunos) {
        pauta.append("Matrícula: ").append(aluno.getMatricula()).append(" Nome: ").append(aluno.getNome()).append("\n");
    }
    return pauta.toString();
}

    public int getCodigo() {
        return codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void addProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return this.disciplina.getNome();
    }

    public String toString() {
        StringBuilder turma = new StringBuilder();
        turma.append("Turma: ").append(this.codigo).append("\n");
        turma.append("Disciplina: ").append(this.disciplina.getNome()).append("\n");
        turma.append("Professor: ").append(this.professor.getNome()).append("\n");
        return turma.toString();
    }
}
