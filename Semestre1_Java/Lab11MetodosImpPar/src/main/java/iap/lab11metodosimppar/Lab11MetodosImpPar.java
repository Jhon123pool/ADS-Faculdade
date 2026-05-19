package iap.lab11metodosimppar;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Lab11MetodosImpPar {
    public static void main(String[] args) {

        // Cria um objeto Scanner, chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria as variáveis inteiras zeradas chamadas 'num' e 'res'.
        int num = 0, res = 0;

        // Pede ao usuário que digite um número inteiro e guarda a resposta dele na variável 'num'.
        System.out.println("Digite um número inteiro.");
        System.out.print("--> ");
        num = entrada.nextInt();

        // A variável 'res' recebe os valores retornados do método 'verifPar(num)'.
        res = verifPar(num);

        /**
         * Se o valor retornado pelo método 'verifPar(num)' for igual a 0, exibe uma 
         * mensagem afirmando que o número digitado pelo usuário é par e caso o número 
         * retornado pelo método seja igual a 1, exibe uma mensagem afirmando que o número 
         * digitado pelo usuário é ímpar.
         */
        if (res == 0) {
            System.out.println(res + " - o número " + num + " é par!");
        } else {
            System.out.println(res + " - o número " + num + " é ímpar!");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }

        /**
         * Com a ajuda de um método, verifica se o número digitado pelo usuário é ímpar ou 
         * par, retornando "0" para par e "1" para ímpar.
         */
        static int verifPar(int num) {

            /**
             * Se o número digitado pelo usuário possuir resto 0 numa divisão por 2, 
             * retorna 0 (indicando que é par), caso contrário retorna 1 (indicando que é 
             * ímpar).
             */
            if (num %2 == 0) {
                return 0; 
            } else {
                return 1;
            }
        }
}