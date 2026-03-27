package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número ao usuário e guarda a resposta dele na variável 'numero'. 
        System. out.print("Digite um número: ");
        int numero = entrada.nextInt();

        /** 
         * Verifica se o número inserido e armazenado na variável 'número' atende 
         * à condição booleana de estar dentro do intervalo de 10 a 50 e guarda um valor lógico
         * se for verdadeiro (true) ou falso (false).
         * */ 
        boolean dentroIntervalo = numero >= 10 && numero <= 50;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("O número " + numero + " está dentro do intervalo de 10 a 50? " + dentroIntervalo + " <-- (true = sim / false = não)");

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}