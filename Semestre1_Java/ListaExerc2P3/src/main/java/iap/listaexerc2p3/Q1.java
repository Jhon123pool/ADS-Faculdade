package iap.listaexerc2p3;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/**
 * Questão 1: Faça um programa para criar um vetor A com 100 elementos inteiros e em
 * seguida chamar um programa que preencha um vetor B de mesmo tipo e tamanho. Cada
 * elemento do vetor B deverá ser o elemento correspondente de A multiplicado por 2. Por
 * exemplo, B[0] = A[0] * 2; B[1] = A[2] * 2; ...; B[99] = A[99] * 2  
 */
public class Q1 {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria um vetor 'A' de 100 elementos.
        int[] A = new int[100];

        // Cria um vetor 'B' de 100 elementos.
        int[] B = new int[100];

        /**
         * Pede ao usuário que digite um número por vez para preencher o vetor A, depois
         * multiplica o número do elemento atual por 2 e guarda este resultado no vetor B 
         * tudo isso enquanto 'i' for menor que 100.
         */
        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o elemento de A[" + i + "]: ");
            A[i] = entrada.nextInt();
            B[i] = A[i] * 2;
        }

        // Imprime todos os elementos do vetor A.
        System.out.println("Vetor A:");
        for (int i = 0; i < 100; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n");
        
        // Imprime todos os elementos do vetor B.
        System.out.println("Vetor B:");
        for (int i = 0; i < 100; i++) {
            System.out.print(B[i] + " ");
        }
    }
}