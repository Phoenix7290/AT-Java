package org.example.AT.Exercise12;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        String[] messages = new String[10];
        int messagesCounter = 0;

        while (messagesCounter < 10) {
            if (messagesCounter % 2 == 0) {
                System.out.print(usuario1 + ", digite sua mensagem: ");
                messages[messagesCounter] = usuario1 + ": " + scanner.nextLine();
            }
            else {
                System.out.print(usuario2 + ", digite sua mensagem: ");
                messages[messagesCounter] = usuario2 + ": " + scanner.nextLine();
            }
            messagesCounter++;
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (String message : messages) {
            System.out.println(message);
        }

        System.out.println("\nObrigado por utilizarem o sistema!");

        scanner.close();
    }
}
