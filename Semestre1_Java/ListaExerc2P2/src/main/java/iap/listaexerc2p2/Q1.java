package iap.listaexerc2p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 1: Faça um programa que leia 100 números e informe o maior número informado. 
 * Use uma estrutura for.
 */
public class Q1 {
    public static void main(String[] args) {

        // Cria um objeto scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria duas variáveis int chamadas 'num' e 'maior'.
        int num = 0, maior = 0;

        // Pede um número inteiro e guarda a resposta em 'num'.
        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();

        // Copia o valor armazenado em 'num'.
        maior = num;

        // Imprime o número armazenado em 'maior' para que o usuário saiba que o programa está acompanhando.
        System.out.println("O maior número digitado foi: " + maior);

        // Avança uma linha para melhorar a legibilidade na interface do usuário.
        System.out.print("\n");

        // Enquanto 'i' for menor ou igual a 100 o laço será executado e o contador será aumentado em 1.
        for (int i = 2; i <=100; i++) {

            // Pede outro número inteiro ao usuário e armazena a resposta dele na variável 'num'.
            System.out.print("Digite outro número inteiro: ");
            num = entrada.nextInt();

            /**
             * Se o número armazenado em 'num' for maior que o número armazenado em 'maior'
             * este número será armazenado em 'maior' substituíndo o valor armazenado
             * anteriormente.
             */
            if (num > maior) {
                maior = num;
            }

            // Imprime o número armazenado em 'maior' para que o usuário saiba que o programa está acompanhando.
            System.out.println("O maior número digitado: " + maior);

            // Imprime a quantidade de números lidos até então.
            System.out.println("Foram lidos " + i + " números.");
            
            // Avança uma linha para melhorar a legibilidade na interface do usuário.
            System.out.print("\n");  
        }
        
        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}