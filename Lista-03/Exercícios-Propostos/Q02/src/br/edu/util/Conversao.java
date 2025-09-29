package br.edu.util;

public class Conversao {

    public int converteParaSegundos(int horas, int minutos, int segundos) {
        int Segundos = (horas * 3600) + (minutos * 60) + segundos;
        return Segundos;
    }
}