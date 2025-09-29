package br.edu.divisao;

public class Divisao_num {

	public int verificarDivisor(int num1, int num2) {
        if (num1 % num2 == 0) {
            return 0;
        } else {
            for (int i = num2 + 1; i <= num1; i++) {
                if (num1 % i == 0) {
                    return i;
                }
            }
            return -1;
        }
    }
}
