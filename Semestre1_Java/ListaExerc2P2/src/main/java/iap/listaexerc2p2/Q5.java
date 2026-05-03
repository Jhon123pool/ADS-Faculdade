package iap.listaexerc2p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Random, que gera números pseudo-aleatórios.
import java.util.Random;

/** 
 * Questão 5: Crie um jogo de adivinhação: desenvolva um programa que gere um número
 * automaticamente no intervalo de 1 a 100 (incluindo ambos). O usuário deve tentar
 * adivinhar esse número. Após cada tentativa, o programa informa se o número correto é 
 * maior ou menor. Continue até acertar. Se a tentativa for fora do intervalo (1–100),
 * será considerada inválida – ignore (continue). Se acertar, pare (break). Após 10
 * tentativas válidas, encerrar automaticamente (break). Use a estrutura de repetição que
 * achar conveniente. 
 */
public class Q5 {
    public static void main(String[] args) {

        // Cria um objeto scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria um objeto Random chamado 'rand'.
        Random rand = new Random();

        // Gera um número pseudo-aleatório entre 1 e 100.
        int num = rand.nextInt(100) + 1;

        //Pede que o usuário tente adivinhar um número que está entre 1 e 100.
        System.out.print("Vamos jogar um jogo?\nTente adivinhar um número de 1 a 100\n");

        // Enquanto 'i' for menor ou igual a 10 o laço será executado e o contador será aumentado em 1.
        for (int i = 1; i <=10; i++) {

            // Espera pelo palpite do usuário e guarda a resposta dele va variável 'ppt'.
            System.out.print("--> ");
            int ppt = entrada.nextInt();

            /**
             * Se o palpite do usuário for menor que 1 ou maior que 100 exibe uma mensagem
             * de "Tentativa inválida" e ignora essa tentativa.
             */
            if (ppt < 1 || ppt > 100) {
                System.out.print("Tentativa inválida - deve ser de 1 a 100.");
                continue;

            // Se o palpite do usuário for maior que o número gerado exibe uma mensagem de "muito alto".
            } else if (ppt > num) {
                System.out.println("muito alto");
            
            // Se o palpite do usuário for menor que o número gerado exibe uma mensagem de "muito baixo".
            } else if (ppt < num) {
                System.out.println("muito baixo");

            // Se o palpite do usuário for igual ao número gerado exibe uma mensagem de "Você acertou!".
            } else if (ppt == num) {
                System.out.println("Você acertou!\nJogo encerrado. Número de tentativas: " + i);
                break;
            } else if (i == 10) {
                System.out.println("Jogo encerrado. Número de tentativas: " + i);
                break;
            }
        }
        
        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}