package iap.lab11metodosmultip5;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Lab11MetodosMultip5 {
    public static void main(String[] args) {

        // Cria um objeto Scanner, chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Cria uma variável inteira zerada chamada 'num'.
        int num = 0;

        // Cria uma variável booleana chamada 'res'.
        boolean res;

        // Pede ao usuário que digite um número inteiro e guarda a resposta dele na variável 'num'.
        System.out.println("Digite um número inteiro.");
        System.out.print("--> ");
        num = entrada.nextInt();

        // A variável 'res' recebe os valores retornados do método 'verifPar(num)'.
        res = multip5(num);

        /**
         * Se o valor retornado pelo método 'verifPar(num)' for igual a 0, exibe uma 
         * mensagem afirmando que o número digitado pelo usuário é par e caso o número 
         * retornado pelo método seja igual a 1, exibe uma mensagem afirmando que o número 
         * digitado pelo usuário é ímpar.
         */
        if (res == true) {
            System.out.println(res + " - o número " + num + " é múltiplo de 5!");
        } else {
            System.out.println(res + " - o número " + num + " não é múltiplo de 5.");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }

        /**
         * Com a ajuda de um método, verifica se o número digitado pelo usuário é ímpar ou 
         * par, retornando "0" para par e "1" para ímpar.
         */
        static boolean multip5 (int num) {

            /**
             * Se o número digitado pelo usuário possuir resto 0 numa divisão por 2, 
             * retorna 0 (indicando que é par), caso contrário retorna 1 (indicando que é 
             * ímpar).
             */
            if (num %5 == 0) {
                return true; 
            } else {
                return false;
            }
        }
}