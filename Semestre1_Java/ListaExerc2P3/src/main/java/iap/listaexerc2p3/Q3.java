package iap.listaexerc2p3;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/**
 * Questão 3: Escreva um programa que recebe 20 valores inteiros positivos e armazena 10 
 * desses valores no vetor A e 10 no vetor B. Em seguida, o programa deve preencher um 
 * terceiro vetor C de acordo com os seguintes critérios: 
 * • C[i] deverá receber 1 quando A[i] for maior que B[i] ; 
 * • C[i] deverá receber 0 quando A[i] for igual a B[i] ; 
 * • C[i] deverá receber -1 quando A[i] for menor que B[i] . 
 * Por fim, o programa deve imprimir A, B e C. 
 */
public class Q3 {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria um vetor 'A' de 10 elementos.
        int[] A = new int[10];

        // Cria um vetor 'B' de 10 elementos.
        int[] B = new int[10];

        // Cria um vetor 'C' de 10 elementos.
        int[] C = new int[10];

        // Pede que o usuário digite os elementos do vetor A e guarda esses valores nos seus devidos lugares.
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento de A[" + i + "]: ");
            A[i] = entrada.nextInt();
        }

        // Pede que o usuário digite os elementos do vetor B e guarda esses valores nos seus devidos lugares.
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento de B[" + i + "]: ");
            B[i] = entrada.nextInt();
        }

        // Percorre os vetores A e B verificando o quesito necessário para preencher o vetor C.
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }

        System.out.println("\nVetor A | Vetor B | Vetor C");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%7d | %7d | %7d\n", A[i], B[i], C[i]);
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();

    }
}