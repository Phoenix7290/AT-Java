package org.example.AT.Exercise07.Aluno;

public class Aluno {
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;
    public double nota3;

    public void calcularMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);
    }

    public void verificarAprovacao() {
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
