package org.example.AT.Exercise02;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre sua senha: ");
        String registeredPassword = scanner.nextLine();

        String enteredPassword;
        do {
            System.out.print("Digite novamente a senha: ");
            enteredPassword = scanner.nextLine();

            if (!registeredPassword.equals(enteredPassword)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (!registeredPassword.equals(enteredPassword));

        System.out.println("Senha cadastrada com sucesso!");

        scanner.close();
    }
}
