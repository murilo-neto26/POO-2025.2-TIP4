package br.edu.verificar;

public class Verificar_positivo {
	public String verificarPosNeg(int num) {
        if (num >= 0) {
            return "Positivo";
        } else {
            return "Negativo";
        }
    }
}