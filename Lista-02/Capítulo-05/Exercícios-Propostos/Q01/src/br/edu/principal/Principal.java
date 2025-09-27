package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n Grupo " + i + " ");
            
            int a, b, c, d;
            
            System.out.print("Digite o 1º valor (A): ");
            a = sc.nextInt();
            System.out.print("Digite o 2º valor (B): ");
            b = sc.nextInt();
            System.out.print("Digite o 3º valor (C): ");
            c = sc.nextInt();
            System.out.print("Digite o 4º valor (D): ");
            d = sc.nextInt();
            
            System.out.println("Ordem Lida: " + a + ", " + b + ", " + c + ", " + d);
            
            
            int x1 = a;
            int x2 = b;
            int x3 = c;
            int x4 = d;
            int temp;
            
            for (int k = 0; k < 3; k++) {
                if (x1 > x2) {
                    temp = x1;
                    x1 = x2;
                    x2 = temp;
                }
                
                if (x2 > x3) {
                    temp = x2;
                    x2 = x3;
                    x3 = temp;
                }
                
                if (x3 > x4) {
                    temp = x3;
                    x3 = x4;
                    x4 = temp;
                }
            }
            
            
            System.out.print("Ordem Crescente: ");
            System.out.print(x1 + ", " + x2 + ", " + x3 + ", " + x4);
            
            System.out.print("\nOrdem Decrescente: ");
            System.out.print(x4 + ", " + x3 + ", " + x2 + ", " + x1);
        }
        
        sc.close();
        System.out.println("\n Fim do Programa ---");
    }
}