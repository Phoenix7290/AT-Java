package org.example.AT.Exercise06.Veiculo;

public class Veiculo {
    public String Placa;
    public String Modelo;
    public int AnoDeFabricacao;
    public double Quilometragem;

    public void exibirDetalhes() {
        System.out.println("Placa: " + Placa);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Ano de Fabricação: " + AnoDeFabricacao);
        System.out.println("Quilometragem: " + Quilometragem);
    }

    public void registrarViagem(double km) {
        Quilometragem += km;
    }
}
