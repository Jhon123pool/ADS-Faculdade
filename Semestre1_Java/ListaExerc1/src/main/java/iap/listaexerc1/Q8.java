package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número ao usuário e guarda a resposta dele na variável 'numero'. 
        System. out.print("Digite um número: ");
        int numero = entrada.nextInt();

        /** 
         * Verifica se o número inserido e armazenado na variável 'número' atende 
         * à condição booleana de possuir um valor maior que zero (0) 
         * e armazena o resultado lógico na variável 'positivo'.
         * */ 
        boolean positivo = numero > 0;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("O número " + numero + " é positivo? " + positivo);

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}