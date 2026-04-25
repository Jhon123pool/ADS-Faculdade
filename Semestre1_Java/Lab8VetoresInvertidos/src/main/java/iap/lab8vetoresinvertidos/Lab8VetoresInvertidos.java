package iap.lab8vetoresinvertidos;

// Importa a classe Random, que gera números aleatórios.
import java.util.Random;

public class Lab8VetoresInvertidos {
    public static void main(String[] args) {

        // Cria um objeto Random chamado 'rand'.
        Random rand = new Random(); 

    // Cria os vetores 'A' e 'B' com tamanho 15.
    int[] A = new int[15];
    int[] B = new int[15];

        /** 
         * Enquanto 'i' (contador) for menor que 15 executa o laço (descrevi o processo
         * abaixo) e aumenta o contador em 1.
         */
        for (int i = 0; i < 15; i++) {

            /** 
             * Gera um número aleatório entre 0 e 14, este número é armazenado em uma
             * posição do vetor.
             */
            A[i] = rand.nextInt(15);

            /** 
             * Preenche uma posição do vetor 'B' (da última posição do vetor [14] até a
             * primeira posição do vetor [0]) com o valor armazenado na atual posição do
             * vetor 'A'. 
             * A posição do vetor 'B' (i) passa a subtrair do total de 14 que
             * representa a última posição do vetor 'B' registrando os números do vetor
             * 'A' numa ordem reversa em 'B'.
             */
            B[14-i] = A[i];
        }

        /**
         *  Imprime os números armazenados no vetor 'A' com a ajuda da estrutura de
         * repetição for, que vai percorrer cada posição do vetor e imprimir o número
         * armazenado nela acompanhado de um espaço.
         */
        System.out.print("A = ");
        for (int i = 0; i < 15; i++) {
            System.out.print(A[i] + " ");
        }

        // Pula para a próxima linha para que 'A' e 'B' não fiquem juntos.
        System.out.print("\n");

        /**
         *  Imprime os números armazenados no vetor 'B' com a ajuda da estrutura de
         * repetição for, que vai percorrer cada posição do vetor e imprimir o número
         * armazenado nela acompanhado de um espaço. Sim, usei a mesma lógica do 'A'.
         */
        System.out.print("B = ");
        for (int i = 0; i < 15; i++) {
            System.out.print(B[i] + " ");
        }
    }
}