package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede a idade do usuário e guarda a resposta dele na variável 'idade'. 
        System. out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        /** 
         * Verifica se a idade inserida e armazenada na variável 'idade' atende 
         * à condição booleana de possuir um valor maior ou igual a dezoito (18) 
         * e armazena o resultado lógico na variável 'maiorDeIdade'.
         * */ 
        boolean maiorDeIdade = idade >= 18;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("Maior de idade? " + maiorDeIdade);

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}