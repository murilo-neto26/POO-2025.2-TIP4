package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        double A, B, C;
        int I;

        System.out.print("Digite um valor para A: ");
        A = sc.nextDouble();

        System.out.print("Digite um valor para B: ");
        B = sc.nextDouble();

        System.out.print("Digite um valor para C: ");
        C = sc.nextDouble();

        System.out.print("Digite um valor para I (1, 2 ou 3): ");
        I = sc.nextInt();

        if (I == 1) {
            if (A < B) {
                if (A < C) {
                    if (B < C) {
                        System.out.println("A ordem crescente é: " + A + " - " + B + " - " + C);
                    } else {
                        System.out.println("A ordem crescente é: " + A + " - " + C + " - " + B);
                    }
                } else {
                    if (C < B) {
                        System.out.println("A ordem crescente é: " + C + " - " + B + " - " + A);
                    } else {
                        System.out.println("A ordem crescente é: " + C + " - " + A + " - " + B);
                    }
                }
            } else if (B < A) {
                if (B < C) {
                    if (A < C) {
                        System.out.println("A ordem crescente é: " + B + " - " + A + " - " + C);
                    } else {
                        System.out.println("A ordem crescente é: " + B + " - " + C + " - " + A);
                    }
                } else {
                    if (C < A) {
                        System.out.println("A ordem crescente é: " + C + " - " + A + " - " + B);
                    } else {
                        System.out.println("A ordem crescente é: " + C + " - " + B + " - " + A);
                    }
                }
            } else {
                if (C < A) {
                    if (B < A) {
                        System.out.println("A ordem crescente é: " + C + " - " + B + " - " + A);
                    } else {
                        System.out.println("A ordem crescente é: " + C + " - " + A + " - " + B);
                    }
                } else {
                    if (A < B) {
                        System.out.println("A ordem crescente é: " + A + " - " + C + " - " + B);
                    } else {
                        System.out.println("A ordem crescente é: " + B + " - " + C + " - " + A);
                    }
                }
            }
        } else if (I == 2) {
            if (A > B) {
                if (A > C) {
                    if (B > C) {
                        System.out.println("A ordem decrescente é: " + A + " - " + B + " - " + C);
                    } else {
                        System.out.println("A ordem decrescente é: " + A + " - " + C + " - " + B);
                    }
                } else {
                    if (C > B) {
                        System.out.println("A ordem decrescente é: " + C + " - " + A + " - " + B);
                    } else {
                        System.out.println("A ordem decrescente é: " + B + " - " + C + " - " + A);
                    }
                }
            } else if (B > A) {
                if (B > C) {
                    if (A > C) {
                        System.out.println("A ordem decrescente é: " + B + " - " + A + " - " + C);
                    } else {
                        System.out.println("A ordem decrescente é: " + B + " - " + C + " - " + A);
                    }
                } else {
                    if (C > A) {
                        System.out.println("A ordem decrescente é: " + C + " - " + B + " - " + A);
                    } else {
                        System.out.println("A ordem decrescente é: " + A + " - " + C + " - " + B);
                    }
                }
            } else {
                if (C > A) {
                    if (B > A) {
                        System.out.println("A ordem decrescente é: " + C + " - " + B + " - " + A);
                    } else {
                        System.out.println("A ordem decrescente é: " + C + " - " + A + " - " + B);
                    }
                } else {
                    if (A > B) {
                        System.out.println("A ordem decrescente é: " + A + " - " + C + " - " + B);
                    } else {
                        System.out.println("A ordem decrescente é: " + B + " - " + C + " - " + A);
                    }
                }
            }
        } else if (I == 3) {
            if (A > B) {
                if (A > C) {
                    System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem desejada é: " + B + " - " + C + " - " + A);
                }
            } else if (B > A) {
                if (B > C) {
                    System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
                }
            } else {
                if (C > A) {
                    System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
                } else {
                    System.out.println("A ordem desejada é: " + B + " - " + C + " - " + A);
                }
            }
        }
    }
}

