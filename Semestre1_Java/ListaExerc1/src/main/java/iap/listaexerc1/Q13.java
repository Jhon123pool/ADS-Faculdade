package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        //Pergunta ao usuário se ele está banido e armazena a resposta dele na variável 'banido'.
        System. out.print("Você está banido? (Digite 'true' para sim ou 'false' para não, seja sincero e não minta.) ");
        boolean banido = entrada.nextBoolean();

        /** 
         * Verifica e inverte o valor lógico (true --> false ou false --> true)
         * armazenado na variável ´banido', em seguida armazena este novo valor lógico
         * na variável 'acessoLiberado'.
         */
        boolean acessoLiberado = !banido;

        /** 
         * Exibe o resultado da inversão booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("Você pode entrar? " + acessoLiberado);

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}