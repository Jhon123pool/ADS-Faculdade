package iap.lab11metodoscontagem;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Lab11MetodosContagem {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria uma variável inteira zerada chamada 'num'.
        int num = 0;

        // Pede que o usuário digite um número inteiro e guarda a resposta dele na variável 'num'
        System.out.println("Digite um número inteiro.");
        System.out.print("--> ");
        num = entrada.nextInt();

        // Inicia o método de contagem.
        contagem();

        // Imprime o valor digitado pelo usuário.
        System.out.println("Você digitou... " + num);

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }

    static void contagem() {
        // Laço externo que roda 100.000 vezes e a cada rodada executa o laço interno uma vez.
        for (int i = 1; i <= 100000; i++) {

            // Laço interno que roda 300.000 vezes a cada rodada do laço externo.
            for (int j = 1; j <= 300000; j++) {
            }
        }
    }
}
