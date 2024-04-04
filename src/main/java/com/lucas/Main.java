package com.lucas;

import com.lucas.classes.Aluno;
import com.lucas.classes.Disciplina;
import com.lucas.classes.Professor;
import com.lucas.classes.Turma;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Disciplina> disciplinas = new ArrayList<>();
    public static List<Turma> turmas = new ArrayList<>();
    public static List<Professor> prof = new ArrayList<>();
    public static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {

        prof.add(new Professor(1, "Antonio"));
        prof.add(new Professor(2, "Maria"));
        prof.add(new Professor(3, "Orlando"));
        alunos.add(new Aluno(1, "Aluno 1"));
        alunos.add(new Aluno(2, "Aluno 2"));
        alunos.add(new Aluno(3, "Aluno 3"));
        alunos.add(new Aluno(4, "Aluno 4"));
        disciplinas.add(new Disciplina(1, "Matematica"));
        disciplinas.add(new Disciplina(2, "Portugues"));
        disciplinas.add(new Disciplina(3, "Musica"));
        disciplinas.add(new Disciplina(4, "Ciencias"));

        //criar TURMA1
        turmas.add(new Turma(1));
        turmas.getFirst().addDisciplina(disciplinas.get(3));
        turmas.getFirst().addProfessor(prof.get(1));
        prof.get(1).addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.getFirst());
        alunos.getFirst().addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(1));
        alunos.get(1).addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(2));
        alunos.get(2).addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(3));

        turmas.add(new Turma(2));
        turmas.get(1).addDisciplina(disciplinas.get(1));
        disciplinas.get(1).addTurma(turmas.get(1));
        turmas.get(1).addProfessor(prof.get(0));
        prof.get(0).addTurma(turmas.get(1));
        turmas.get(1).addAluno(alunos.get(0));
        alunos.get(0).addTurma(turmas.get(1));
        turmas.add(new Turma(3));
        turmas.get(2).addDisciplina(disciplinas.get(2));
        turmas.get(2).addProfessor(prof.get(0));
        prof.get(0).addTurma(turmas.get(2));
        turmas.get(2).addAluno(alunos.get(3));

        System.out.println(" > Turmas: ");
        turmas.forEach(turma -> {
            System.out.println(turma.toString());
        });

        System.out.println(turmas.get(0).gerarPauta());

        System.out.println(alunos.getFirst().exibirTurmas());

        System.out.println(prof.get(0).exibirTurmas());

        System.out.println(disciplinas.get(1).exibirTurmas());
    }
}
