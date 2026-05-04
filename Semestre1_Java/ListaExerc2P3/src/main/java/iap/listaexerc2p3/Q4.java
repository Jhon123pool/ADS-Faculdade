package iap.listaexerc2p3;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/**
 * Questão 4: Escreva um programa que lê n x m valores, n, m <= 10 e os armazena 
 * em uma matriz real Amxn linha a linha. Em seguida:
 * i) imprime esta matriz.
 * ii) calcula e imprime a soma dos elementos da linha l da matriz.
 * iii) calcula e imprime o produto dos elementos da coluna c da matriz.
 */
public class Q4 {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede as dimensões da matriz ao usuário.
        System.out.print("Digite o número de linhas (m <= 10): ");
        int m = entrada.nextInt();
        System.out.print("Digite o número de colunas (n <= 10): ");
        int n = entrada.nextInt();

        // Validação básica para garantir que 'm' e 'n' estão no limite permitido.
        while (m > 10 || n > 10 || m <= 0 || n <= 0) {
            System.out.println("Valor inválido, tente novamente.");
            System.out.print("Linhas (m): "); m = entrada.nextInt();
            System.out.print("Colunas (n): "); n = entrada.nextInt();
        }

        // Cria a matriz real'A'.
        double[][] A = new double[m][n];

        // Pede que o usuário digite os elementos da matriz A.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite A[" + i + "][" + j + "]: ");
                A[i][j] = entrada.nextDouble();
            }
        }

        // i) Imprime a matriz formatada.
        System.out.println("\nMatriz A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%8.2f  ", A[i][j]);
            }
            System.out.println();
        }

        // ii) Calcula e imprime a soma dos elementos da linha l.
        System.out.print("\nDigite o índice da linha 'l' para somar (0 a " + (m-1) + "): ");
        int l = entrada.nextInt();
        double sLinha = 0;
        for (int j = 0; j < n; j++) {
            sLinha += A[l][j];
        }
        System.out.println("Soma da linha " + l + ": " + sLinha);

        // iii) Calcula e imprime o produto dos elementos da coluna c.
        System.out.print("Digite o índice da coluna 'c' para o produto (0 a " + (n-1) + "): ");
        int c = entrada.nextInt();
        double prodColC = 1;
        for (int i = 0; i < m; i++) {
            prodColC *= A[i][c];
        }
        System.out.println("Produto da coluna " + c + ": " + prodColC);

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}