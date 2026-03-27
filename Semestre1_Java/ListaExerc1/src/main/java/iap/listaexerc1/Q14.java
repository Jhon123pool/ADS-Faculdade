package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        //Pergunta a idade do usuário e armazena a resposta dele na variável 'idade'.
        System. out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        /** 
         * Pergunta ao usuário se ele é um estudante e armazena a resposta dele
         * como valor lógico (true ou false) na variável booleana chamada 'possuiIngresso'.
         */
        System. out.print("Você é estudante? (Digite 'true' para sim ou 'false' para não.) ");
        boolean estudante = entrada.nextBoolean();

        /** 
         * Verifica se as respostas do usuário que foram armazanadas nas variáveis 'idade'
         * e 'estudante' atendem às condições de não maioridade e estar estudando (true).
         */
        boolean meiaEntrada = (idade < 18) && estudante;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("Você tem direito a meia entrada? " + meiaEntrada);

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}