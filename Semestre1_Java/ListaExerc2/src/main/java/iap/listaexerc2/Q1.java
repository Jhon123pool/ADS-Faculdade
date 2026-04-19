package iap.listaexerc2;

// Importa o Scanner, que lê o inpyut do usuário.
import java.util.Scanner;

/** 
 * Faça um programa que peça um inteiro entre zero e dez. Mostre uma mensagem caso o 
 * valor seja inválido e continue pedindo até que o usuário informe um valor válido. 
 */
public class Q1 {
    public static void main(String[] args) {
        
        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número inteiro ao usuário e guarda a resposta dele na variável 'num'.
        System.out.print("Digite um número inteiro entre zero (0) e dez (10): ");
        int num = entrada.nextInt();

        /**
         * Verifica se o número armazenado na variável 'num' está entre 0 e 10 (incluindo),
         * caso positivo continua pedindo um número inteiro entre 0 e 10.
         */
        while (num >= 0 && num <= 10) {
            System.out.print("Digite outro número inteiro entre zero (0) e (10): ");
            num = entrada.nextInt();
        }

        /** 
         * Se o número armazenado em 'num' estiver fora do intervalo requerido,
         * uma mensagem de número inválido é exibida.
         */
        if (num < 0 || num > 10) {
            System.out.print("O número " + num + " é inválido.");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}