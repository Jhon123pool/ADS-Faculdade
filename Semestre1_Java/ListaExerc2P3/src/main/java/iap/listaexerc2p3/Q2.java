package iap.listaexerc2p3;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/**
 * Questão 2: Escreva um programa que recebe 20 valores inteiros positivos e os armazena
 * em um vetor. Em seguida verifica se todos os elementos do vetor são pares. Se pelo
 * menos um elemento for ímpar, o programa deve imprimir false. Caso contrário, deve
 * imprimir true.
 */
public class Q2 {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria um vetor 'A' de 20 elementos.
        int[] A = new int[20];

        // Cria uma variável booleana chamada 'pares' e seta o valor para 'true'.
        boolean pares = true;

        /**
         * Pede ao usuário que digite os elementos do vetor A e guarda a resposta dele
         * no devido espaço de vetor.
         */
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o elemento de A[" + i + "]: ");
            A[i] = entrada.nextInt();
        }

        /**
         * Verifica se os elementos de 'A' são pares (resto 0 quando dividido por 2),
         * caso negativo, muda o valor da variável booleana 'pares' para 'false' e encerra
         * a verificação.
         */
        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                pares = false;
                break;
            }
        }

        // Imprime o resultado da verificação.
        System.out.println("Todos são pares?" + pares);

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();

    }
}