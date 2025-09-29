package br.edu.soma;

import java.util.Scanner;

public class Soma_dos_números {
	
    public static long somar(int n) {
        if (n <= 0) {
            System.out.println("Aviso: O número N deve ser positivo. Retornando 0.");
            return 0; 
        }
        
        long soma = 0; 

        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        
        return soma;
    }
}