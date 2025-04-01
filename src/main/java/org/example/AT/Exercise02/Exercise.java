package org.example.AT.Exercise02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise {
    public static String validatePassword(String password) {
        if (password.length() < 8) {
            return "A senha deve ter no mínimo 8 caracteres.";
        }

        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }

        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return "A senha deve conter pelo menos um número.";
        }

        if (!Pattern.compile("[@#$%^&*()_+=\\[\\]{};':\"\\\\|,.<>/?]").matcher(password).find()) {
            return "A senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        }

        return "Senha válida!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        while (true) {
            System.out.print("Digite sua senha: ");
            String password = scanner.nextLine();

            String result = validatePassword(password);
            System.out.println(result);

            if (result.equals("Senha válida!")) {
                System.out.println("Cadastro concluído com sucesso, " + name + "!");
                break;
            } else {
                System.out.println("Tente novamente.\n");
            }
        }

        scanner.close();
    }
}
