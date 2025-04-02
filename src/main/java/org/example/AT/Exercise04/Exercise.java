package org.example.AT.Exercise04;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo: R$ ");
        double loanAmount = scanner.nextDouble();

        System.out.println("Em quantas vezes deseja parcelar o empréstimo?" +
                "\nMínimo de 6 parcelas e máximo de 48 parcelas.");
        int installments = scanner.nextInt();

        if (installments < 6 || installments > 48) {
            System.out.println("Número de parcelas inválido.");
            return;
        }

        double monthlyInterestRate = 0.03;
        double totalAmount = loanAmount * Math.pow(1 + monthlyInterestRate, installments);
        double monthlyInstallment = totalAmount / installments;

        System.out.println("Nome: " + name);
        System.out.printf("Valor total a ser pago: R$ %.2f%n", totalAmount);
        System.out.printf("Valor da parcela mensal: R$ %.2f%n", monthlyInstallment);

        scanner.close();

    }
}
