package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        //Pergunta a idade do usuário e armazena a resposta dele na variável 'idade'.
        System. out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        //Pergunta a altura em centímetros do usuário e armazena a resposta dele na variável 'altura'.
        System. out.print("Digite a sua altura em centímetros: (Por exemplo: 1,60m = 160cm) ");
        int altura = entrada.nextInt();

        /** 
         * Pergunta ao usuário se ele está acompanhado por um responsável e armazena a resposta dele
         * como valor lógico (true ou false) na variável booleana chamada 'acompanhadoResponsavel'.
         */
        System. out.print("Você está acompanhado por um responsável? (Digite 'true' para sim ou 'false' para não.) ");
        boolean acompanhadoResposavel = entrada.nextBoolean();

        /** 
         * Verifica se as respostas do usuário que foram armazanadas nas variáveis 'idade'
         * e 'altura' atendem às condições de faixa etária e altura (as duas têm que ser verdadeiras)
         * ou se ele está acompanhado por um responsável.
         */
        boolean podeBrincar = (idade >= 12) && (altura >= 140) || acompanhadoResposavel;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("Você pode brincar? " + podeBrincar + " <-- (true = sim / false = não)");

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}