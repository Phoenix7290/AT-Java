package org.example.AT.Exercise06;

import org.example.AT.Exercise06.Veiculo.Veiculo;

public class Exercise {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.Placa = "ABC1234";
        veiculo.Modelo = "Fusca";
        veiculo.AnoDeFabricacao = 1969;
        veiculo.Quilometragem = 50000.0;

        veiculo.exibirDetalhes();

        veiculo.registrarViagem(100.0);
    }
}
