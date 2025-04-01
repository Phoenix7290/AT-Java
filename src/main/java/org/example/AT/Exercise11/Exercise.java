package org.example.AT.Exercise11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] drawnNumbers = new int[6];
        for (int i=0; i<6; i++) {
            int number;
            boolean isUnique;
            do {
                number = random.nextInt(60) + 1;
                isUnique = false;
                for (int j=0; j<i; j++) {
                    if (drawnNumbers[j] == number) {
                        isUnique = true;
                        break;
                    }
                }
            } while (isUnique);
            drawnNumbers[i] = number;
        }

        int[] numbersUser = new int[6];
        System.out.println("Digite 6 números na loteria (entre 1 e 60):");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = Integer.parseInt(scanner.nextLine());
            while (numero < 1 || numero > 60) {
                System.out.print("Número inválido! Digite novamente (1-60): ");
                numero = Integer.parseInt(scanner.nextLine());
            }
            for (int j = 0; j < i; j++) {
                if (numbersUser[j] == numero) {
                    System.out.print("Número repetido! Digite outro: ");
                    numero = Integer.parseInt(scanner.nextLine());
                    j = -1;
                }
            }
            numbersUser[i] = numero;
        }

        Arrays.sort(numbersUser);

        int rightNumbers = 0;
        for (int numUser : drawnNumbers) {
            for (int numDrawn : numbersUser) {
                if (numUser == numDrawn) {
                    rightNumbers++;
                    break;
                }
            }
        }
        System.out.println("\nNúmeros sorteados: " + Arrays.toString(drawnNumbers));
        System.out.println("Números apostados: " + Arrays.toString(numbersUser));
        System.out.println("Você acertou " + rightNumbers + " números.");

        scanner.close();
    }
}
