package br.edu.principal;

import java.util.Scanner;

import br.edu.verificar.Verificar_positivo;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Verificar_positivo verificador = new Verificar_positivo();

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        String posNeg = verificador.verificarPosNeg(num);

        System.out.println("O número é " + posNeg);

    }
}