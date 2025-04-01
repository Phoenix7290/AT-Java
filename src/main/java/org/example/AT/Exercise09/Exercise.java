package org.example.AT.Exercise09;

import org.example.AT.Exercise09.ContaBancaria.ContaBancaria;

public class Exercise {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Gabriel", 1000.0);

        conta.depositar(500.0);
        conta.sacar(200.0);

        conta.exibirSaldo();
        conta.exibirTitular();
    }
}
