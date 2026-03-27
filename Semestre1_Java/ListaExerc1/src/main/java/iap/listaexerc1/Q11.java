package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pergunta a idade do usuário e armazena a resposta dele na variável 'idade'.
        System. out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        /** 
         * Pergunta ao usuário se ele possui carteira de habilitação e armazena a resposta dele
         * como valor lógico (true ou false) na variável booleana chamada 'possuiCarteira'.
         */
        System. out.print("Você possui carteira de habilitação? (Digite 'true' para sim ou 'false' para não.) ");
        boolean possuiCarteira = entrada.nextBoolean();

        /** 
         * Verifica se os valores armazenados nas variáveis 'idade' e 'possuiCarteira' atendem aos
         * pré-requisitos de maioridade e posse da carteira e guarda um valor lógico na variável 
         * 'podeDirigir' que pode ser 'true' (verdadeiro) ou 'false' (falso), mas que neste caso requere
         * que as duas condições sejam verdadeiras para guardar o valor 'true' na variável correspondente.
         */
        boolean podeDirigir = (idade >= 18) && possuiCarteira;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("Você pode dirigir? " + podeDirigir);

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}