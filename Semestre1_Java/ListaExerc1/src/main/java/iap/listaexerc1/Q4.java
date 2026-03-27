package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede a base de um retângulo ao usuário e guarda a resposta dele na variável 'base'. 
        System. out.print("Digite a sua idade para convertê-la em dias: ");
        int idade = entrada.nextInt();

        /** 
         * Multiplica o número guardado na variável 'idade' pela quantidade de dias em um ano comum (365) e  armazena o resultado da multiplicação na variável 'dias'.
         */
        int dias = idade * 365;

        /** 
         * Exibe a o resultado da multiplicação da idade em dias do usuário, 
         * resultado este está armazenado na variável 'dias'.
         */
        System.out.printf("A sua idade em dias é " + dias + " dias. (Desconsiderando anos bissextos.)");

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}