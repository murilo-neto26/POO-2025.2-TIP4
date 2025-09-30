package br.edu.util;

public class CalculoReajuste {
    public static double calculoReajuste(double precoAntigo, double precoAtual) {
        return ((precoAtual - precoAntigo) / precoAntigo) * 100;
    }
}

