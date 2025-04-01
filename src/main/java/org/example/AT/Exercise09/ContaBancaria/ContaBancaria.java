package org.example.AT.Exercise09.ContaBancaria;

public class ContaBancaria {
    String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void exibirTitular() {
        System.out.println("Titular: " + titular);
    }
}
