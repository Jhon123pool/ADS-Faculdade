package iap.lab8matrizesmultidim;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Random, que gera números pseudo-aleatórios.
import java.util.Random;

public class Lab8MatrizesMultiDim {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria um objeto Random chamado 'rand'.
        Random rand = new Random();

        // Pede uma quantidade de linhas para a matriz ao usuário e guarda a resposta dele na variável 'm'.
        System.out.print("Digite o número de linhas da matriz (m <= 10): ");
        int m = entrada.nextInt();

        // Pede uma quantidade de colunas para a matriz ao usuário e guarda a resposta dele na variável 'n'.
        System.out.print("Digite o número de colunas da matriz (n <= 10): ");
        int n = entrada.nextInt();

        /**
         * Se o usuário definir um valor maior que 10 para 'm' ou 'n' exibe uma mensagem
         * de valor inválido e pede que o usuário tente novamente.
         */
        while (m > 10 || n > 10 || m <= 0 || n <= 0) {
            System.out.println("Você digitou um valor inválido, tente novamente.");
            System.out.print("Digite o número de linhas da matriz (m <= 10): ");
            m = entrada.nextInt();
            System.out.print("Digite o número de colunas da matriz (n <= 10): ");
            n = entrada.nextInt();
        }

        // Cria a matriz 'A' com a quantidade de linhas e colunas definidas pelo usuário.
        int[][] A = new int[m][n];

        // Requisito I-a: Define o primeiro elemento da matriz como 1.
        A[0][0] = 1;
        
        /**
         * Preenche o restante da primeira linha somando o valor anterior 
         * ao número da coluna atual.
         */
        for (int i = 1; i < n; i++) {
            A[0][i] = A[0][i-1] + i;
        }

        /**
         * Requisito I-c: Preenche a linha 1 com números inteiros 
         * aleatórios positivos entre 1 e 40 (inclusive).
         */
        for (int j = 0; j < n; j++) {
            A[1][j] = rand.nextInt(40) + 1;
        }

        /** 
         * Requisito I-d: Preenche as linhas seguintes (2 em diante).
         * Cada elemento é: (Linha atual * Elemento acima) + Elemento da linha 0.
         */
        for (int i = 2; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = (i * A[i-1][j]) + A[0][j];
            }
        }
        
        /**
         * Imprime a matriz A com a ajuda de algumas estruturas de repetição for. Para
         * formatar eu usei 6 espaços para as colunas o que ajuda no alinhamento.
         */
        System.out.println("\nMatriz A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

            // Imprime os elementos da matriz A com seus devidos espaços.
            System.out.printf("%6d  ", A[i][j]); 
            }
        System.out.println(); // Quebra de linha ao fim de cada linha pra organizar.
        }

        //Cria a matriz B com uma linha e uma coluna extra para armazenar os somatórios (totais marginais).
        int[][] B = new int[m + 1][n + 1];

        /**
         * Realiza a transferência de dados para a matriz B enquanto calcula
         * simultaneamente a soma acumulada de cada linha e cada coluna.
         */
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Copia o valor original de 'A[][]' para 'B[][]'.
                B[i][j] = A[i][j];

                // Acumula a soma na última coluna da linha 'i'.
                B[i][n] += A[i][j];

                // Acumula a soma na última linha da coluna 'j'.
                B[m][j] += A[i][j];
            }
        }

        // Define o último elemento como 0.
        B[m][n] = 0;

        // Imprime a matriz B com a ajuda de mais algumas estuturas de repetição for seguindo a mesma ideia de formatação da matriz A.
        System.out.println("\nMatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
            // Imprime os elementos da matriz B com alguns espaços para formatação.
            System.out.printf("%6d  ", B[i][j]); 
            }
        System.out.println(); // Quebra de linha após cada linha da matriz
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}