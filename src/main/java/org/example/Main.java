package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a questão do AT (1-12):");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 12) {
            System.out.println("Escolha inválida. Por favor, escolha entre 1 e 12.");
            return;
        }

        try {
            Class.forName("org.example.AT.Exercise" + String.format("%02d", choice) + ".Exercise")
                    .getMethod("main", String[].class)
                    .invoke(null, (Object) new String[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}