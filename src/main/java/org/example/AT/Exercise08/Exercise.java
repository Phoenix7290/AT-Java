package org.example.AT.Exercise08;

import org.example.AT.Exercise08.Funcionario.Estagiario;
import org.example.AT.Exercise08.Funcionario.Funcionario;
import org.example.AT.Exercise08.Funcionario.Gerente;

public class Exercise {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("João", 2000);
        Funcionario estagiario = new Estagiario("Maria", 2000);

        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
        System.out.println("Salário do Estagiário: " + estagiario.calcularSalario());
    }
}
