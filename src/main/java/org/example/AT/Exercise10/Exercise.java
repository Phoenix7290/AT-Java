package org.example.AT.Exercise10;

import java.io.*;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String directoryFile = "src/main/java/org/example/AT/Exercise10/Files/";
        String fileName = "compras.txt";
        String fullPath = directoryFile + fileName;

        System.out.println("Cadastre 3 compras com:" +
                "\nProduto, quantidade e preço unitário.");

        try (PrintWriter writer = new PrintWriter(new FileWriter(fullPath))) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nCompra " + i + ":");
                System.out.print("Digite o nome do produto: ");
                String product = scanner.nextLine();
                System.out.print("Digite a quantidade: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.print("Digite o preço unitário: ");
                double price = Double.parseDouble(scanner.nextLine());

                String purchaseData = "Compra " + i + ":\n" +
                        product + "\n" +
                        quantity + "\n" +
                        price + "\n";
                writer.println(purchaseData);
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        System.out.println("\nCompras registradas:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                String product = reader.readLine();
                String quantity = reader.readLine();
                String price = reader.readLine();
                reader.readLine();

                double priceNum = Double.parseDouble(price);
                int quantityNum = Integer.parseInt(quantity);
                double total = priceNum * quantityNum;
                System.out.println("Produto: " + product);
                System.out.println("Quantidade: " + quantity);
                System.out.println("Preço unitário: R$" + String.format("%.2f", priceNum));
                System.out.println("Total: R$" + String.format("%.2f", total));
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
