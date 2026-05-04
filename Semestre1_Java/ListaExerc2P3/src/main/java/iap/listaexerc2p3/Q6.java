package iap.listaexerc2p3;

// Importa o Random, que gera números pseudo-aleatórios.
import java.util.Random;

/**
 * Questão 6: Escreva um programa que gere 36 números inteiros de 1 a 50 e os 
 * armazene em uma matriz quadrada (6x6). Em seguida, imprima:
 * a) a matriz criada;
 * b) os elementos da diagonal principal;
 * c) os elementos da diagonal secundária.
 */
public class Q6 {
    public static void main(String[] args) {

        // Cria um objeto Random chamado 'rand'.
        Random rand = new Random();

        // Cria uma matriz chamada 'A' com dimensões de 6 por 6.
        int[][] A = new int[6][6];

        // Preenche a matriz A com números aleatórios entre 1 e 50.
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = rand.nextInt(50) + 1;
            }
        }

        // a) Imprime a matriz completa.
        System.out.println("Matriz A:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%4d  ", A[i][j]);
            }
            System.out.println();
        }

        // b) Imprime a diagonal principal (onde i == j).
        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 6; i++) {
            System.out.print(A[i][i] + " ");
        }

        // c) Imprime a diagonal secundária (onde j = (tamanho - 1) - i).
        System.out.println("\n\nDiagonal Secundária:");
        for (int i = 0; i < 6; i++) {
            // Em uma matriz 6x6a soma dos índices da secundária é sempre 5.
            System.out.print(A[i][5 - i] + " ");
        }
        System.out.println();
    }
}