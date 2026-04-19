package iap.listaexerc2;

// Importa o Scanner, que lê o inpyut do usuário.
import java.util.Scanner;

// Importa o Locale, que reconhece o ponto (.) como separador decimal.
import java.util.Locale;

/** 
 * Altere o programa anterior, permitindo ao usuário informar as populações e as taxas de crescimento
 * iniciais. Permita também repetir a operação. 
 */
public class Q5 {
    public static void main(String[] args) {
        
        /**
         * Cria um objeto Scanner chamado 'entrada' e configura o Locale pro padrão
         * americano que reconhece o ponto (.) como separador decimal.
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Cria a variável 'continuar', que vai armazenar a resposta do usuário sobre rodar o código novamente.
        char continuar;
        
        do {
            // Pede a população de A ao usuário e guarda a resposta dele na variável 'popA'.
            System.out.print("Para começar o nosso probleminha, defina a população do país A (use apenas números): ");
            double popA = entrada.nextDouble();

            // Pede a população de B ao usuário e guarda a resposta dele na variável 'popB'.
            System.out.print("Agora defina a população do país B (novamente, use apenas números): ");
            double popB = entrada.nextDouble();

            /** 
            * Pede a taxa de crescimento anual da população de A ao usuário e guarda a
            * resposta dele na variável 'crescA'.
            */
            System.out.print("Com as populações de A e B definidas, o próximo passo é definir a taxa\nanual de crescimento de A, digite a porcentagem em números: ");
            double crescA = entrada.nextDouble();

            // Converte o valor inteiro da taxa anual de crescimento de A para porcentagem.
            crescA = crescA / 100;

            /** 
            * Pede a taxa de crescimento anual da população de B ao usuário e guarda a
            * resposta dele na variável 'crescA'.
            */
            System.out.print("Agora defina a taxa anual de crescimento de B, digite a porcentagem em números: ");
            double crescB = entrada.nextDouble();

            // Converte o valor inteiro da taxa anual de crescimento de B para porcentagem.
            crescB = crescB / 100;

            /**
            * Enfeite meu: Apresenta a situação ao usuário e pede o palpite dele, essa
            * resposta será armazenada na variável 'chute'.
            */
            System.out.print("Agora temos um probleminha pronto!\nSupondo que o país A com população de " + popA + " habitantes tenha uma taxa\nanual de crescimento de " + crescA + ", e o país B com população de " + popB + " habitantes tenha uma taxa\nanual de crescimento de " + crescB + ", quantos anos serão necessários para que a população do país A\nse iguale ou supere a população do país B?\nDigite o seu palpite (só o número em anos): ");
            int chute = entrada.nextInt();

            // Inicia o acumulador dos anos.
            int anos = 0;

            /** 
             * Verifica se os dados inseridos pelo usuário são realmente possíveis, 
             * caso positivo, inicia o cálculo, caso negativo, exibe uma mensagem de erro.
             */
            if (popA < popB && crescA <= crescB) {
                System.out.println("Nesse cenário, o país A nunca alcançará o B!");
            } else {
                // Realiza o cálculo de crescimento populacional enquanto a população de A seja menor que a de B.
                while (popA < popB) {
                    popA = popA + (popA * crescA);
                    popB = popB + (popB * crescB);
                    anos++;
                }
            }
        
            /**
            * Também faz parte do enfeite, se o palpite do usuário for igual à quantidade
            * de anos necessários para que a população de A seja igual ou maior que a
            * população de B, exibe uma mensagem parabenizando o usuário, caso ele erre no
            * palpite, uma mensagem mostrará a resposta correta e a diferença pra resposta
            * do usuário.
            */
            if (chute == anos) {
                System.out.println("Parabéns, você acertou! :D");
            } else {
                int diferenca = Math.abs(anos - chute);
                System.out.println("Não foi dessa vez! A resposta correta é " + anos + ".");
                System.out.println("Você errou por apenas " + diferenca + " anos!");
            }

            // Pergunta ao usuário se ele quer repetir o código e guarda a resposta dele na variável 'continuar'.
            System.out.print("Deseja repetir? (s/n): ");
            continuar = entrada.next().toUpperCase().charAt(0);

            // Valida a resposta do usuário sobre querer repetir o programa (s) ou não (n).
            while (continuar != 'S' && continuar != 'N') {
                System.out.print("Opção inválida! Digite 's' para sim ou 'n' para não: ");
                continuar = entrada.next().toUpperCase().charAt(0);
            } 
        // Roda o looping (volta do início) se o usuário escolher 's' (que foi convertido para maiúscula).
        } while (Character.toUpperCase(continuar) == 'S');

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}