package org.example.AT.Exercise08.Funcionario;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Total: " + calcularSalario());
    }
}
