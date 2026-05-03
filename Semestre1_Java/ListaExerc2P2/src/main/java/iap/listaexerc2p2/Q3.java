package iap.listaexerc2p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 3: Simule um sistema de caixa eletrônico simplificado supondo um saldo inicial. 
 * Mostre um menu:     
 * 1 - Ver saldo     
 * 2 - Depositar     
 * 3 - Sacar     
 * 4 - Sair 
 * Repita até o usuário sair e não permita saque maior que o saldo. 
 * Use uma estrutura dowhile.        
 */
public class Q3 {
    public static void main(String[] args) {

        // Cria um objeto scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Define uma variável float chamada 'saldo'.
        float saldo = 5000;

        int opcao = 0;

        // Dá as boas-vindas ao usuário.
        System.out.println("Bem vindo ao caixa eletrônico!");

        do {
            // Imprime o menu de opções e guarda a resposta do usuário em 'opcao'.
            System.out.print("Escolha uma opção:\n1 - Ver saldo\n2 - Depositar\n3 - Sacar\n4 - Sair\n==> ");
            opcao = entrada.nextInt();

            // Se o usuário escolher 1, mostra o saldo.
            if (opcao == 1) {
                System.out.print("\nSaldo: R$ " + saldo + "\n\n");

            /**
             * Se o usuário escolher 2, pergunta o valor a ser depositado, armazena este
             * valor em 'deposito' e incrementa este valor ao saldo.
             */
            } else if (opcao == 2) {
                System.out.print("Valor a depositar: R$ ");
                float deposito = entrada.nextFloat();
                saldo += deposito;
                System.out.println("\nDepósito efetuado!\n");

            /**
             * Se o usuário escolher 3, pergunta o valor a ser sacado e guarda este valor
             * em 'saque', em seguida verifica se este valor não sobrepassa o valor do
             * saldo, caso positivo o saque é efetuado, caso negativo, uma mensagem de
             * "Saldo insuficiente" é exibida.
             */    
            } else if (opcao == 3) {
                System.out.print("Valor a sacar: R$ ");
                float saque = entrada.nextFloat();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("\nSaque efetuado!\n");
                } else {
                    System.out.println("Saldo insuficiente.");
                }

            // Se o usuário escolher 4, despede o usuário.    
            } else if (opcao == 4) {
                System.out.println("Até a próxima!");
            }
        } while (opcao != 4);

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}