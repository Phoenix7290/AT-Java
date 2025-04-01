package org.example.AT.Exercise03;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite o seu salário mensal: R$ ");
        double monthlySalary = scanner.nextDouble();
        double annualSalary = monthlySalary * 12;
        double tax = 0;

        if (annualSalary <= 22847.76) {
            System.out.println("Isento de imposto de renda.");
        } else if (annualSalary <= 33919.80) {
            tax = annualSalary * 0.075;
            annualSalary = annualSalary - tax;
            System.out.println("Alíquota de 7,5%.");
        } else if (annualSalary <= 45012.60) {
            tax = annualSalary * 0.15;
            annualSalary = annualSalary - tax;
            System.out.println("Alíquota de 15%.");
        } else {
            tax = annualSalary * 0.275;
            annualSalary = annualSalary - tax;
            System.out.println("Alíquota de 27,5%.");
        }

        System.out.println("Nome: " + name);
        System.out.println("Imposto devido: R$ " + tax);
        System.out.println("Seu salário líquido anual: R$ " + annualSalary);

        scanner.close();
    }
}