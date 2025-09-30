package br.edu.util;

public class Transformacao {
    public static void transforma(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int seg = segundos % 60;

        System.out.println("Resultado: " + horas + "h " + minutos + "m " + seg + "s");
    }
}


