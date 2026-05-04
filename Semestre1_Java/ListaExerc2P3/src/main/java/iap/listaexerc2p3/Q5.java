package iap.listaexerc2p3;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/**
 * Questão 5: Escreva um programa que leia 2 x n x m valores inteiros (m, n <= 10)
 * e armazene metade deles em uma matriz A e a outra metade em uma matriz Bmxn.
 * Em seguida encontre a matriz C = A + B e imprima A, B e C.
 * Lembre que, dadas as matrizes A = [aіj] e B = [bіj], de ordem m x n a soma A + B é a
 * matriz C = [cіj], de ordem m x n tal que cіj= aіj + bіj para todo 1 ≤ i ≤ m, 1 ≤ j ≤ n.
 */
public class Q5 {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede as dimensões das matrizes ao usuário.
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

        // Declara as matrizes A, B e C de tamanho 'm' x 'n'.
        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        // Pede que o usuário digite os elementos da matriz A.
        System.out.println("\nPreenchendo a Matriz A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = entrada.nextInt();
            }
        }

        // Pede que o usuário digite os elementos da matriz B.
        System.out.println("\nPreenchendo a Matriz B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = entrada.nextInt();
            }
        }

        // Realiza a soma das matrizes A e B e guarda o resultado em C.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Imprime as três matrizes de forma organizada.
        System.out.println("\nMatriz A:");
        imprimirMatriz(A, m, n);

        System.out.println("\nMatriz B:");
        imprimirMatriz(B, m, n);

        System.out.println("\nMatriz C (A + B):");
        imprimirMatriz(C, m, n);

        // Fecha o Scanner.
        entrada.close();
    }

    // Método auxiliar para imprimir matrizes (tô testando firula, o método de impressão que eu usei mais cedo pras matrizes deixa o código muito longo.)
    public static void imprimirMatriz(int[][] matriz, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6d  ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}