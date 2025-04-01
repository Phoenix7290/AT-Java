package org.example.AT.Exercise07;

import org.example.AT.Exercise07.Aluno.Aluno;

public class Exercise {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Marcos Ryan";
        aluno.matricula = "123456";
        aluno.nota1 = 7.0;
        aluno.nota2 = 8.0;
        aluno.nota3 = 9.0;

        aluno.calcularMedia();

        aluno.verificarAprovacao();
    }
}
