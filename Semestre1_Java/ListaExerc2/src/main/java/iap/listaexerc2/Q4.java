package iap.listaexerc2;

// Importa o Scanner, que lê o inpyut do usuário.
import java.util.Scanner;

// Importa o Locale, que reconhece o ponto (.) como separador decimal.
import java.util.Locale;

/** 
 * Supondo que a população atual de um país A seja 80000 habitantes com uma taxa anual de crescimento
 * de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%, faça um
 * programa que calcule e escreva o número de anos necessários para que a população do país A
 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.  
 * Restrição: Use um laço para calcular a população de cada país ano a ano. 
 */
public class Q4 {
    public static void main(String[] args) {
        
        /**
         * Cria um objeto Scanner chamado 'entrada' e configura o Locale pro padrão americano
         * que reconhece o ponto (.) como separador decimal.
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        /** 
         * Enfeite meu: Apresenta a situação ao usuário e pede o palpite dele, essa resposta será
         * armazenada na variável 'chute'.
         */
        System.out.print("Supondo que o país A com população de 80.000 habitantes tenha uma taxa\nanual de crescimento de 3%, e o país B com população de 200.000 habitantes tenha uma taxa\nanual de crescimento de 1.5%, quantos anos serão necessários para que a população do país A\nse iguale ou supere a população do país B?\nDigite o seu palpite (só o número em anos): ");
        int chute = entrada.nextInt();

        // Inicia o acumulador dos anos.
        int anos = 0;

        // Cria a variável 'popA' e 'popB' e define o valor da população de A e B.
        double popA = 80000, popB = 200000;

        // Realiza o cálculo de crescimento populacional enquanto a população de A seja menor que a de B.
        while (popA < popB) {
            popA = popA + (popA * 0.03);
            popB = popB + (popB * 0.015);
            anos++;
        }
        
        /**
         * Também faz parte do enfeite, se o palpite do usuário for igual à quantidade de anos
         * necessários para que a população de A seja igual ou maior que a população de B, exibe
         * uma mensagem parabenizando o usuário, caso ele erre no palpite, uma mensagem mostrará
         * a resposta correta e a diferença pra resposta do usuário.
         */
        if (chute == anos) {
            System.out.println("Parabéns, você acertou! :D");
        } else {
            int diferenca = Math.abs(anos - chute);
            System.out.println("Não foi dessa vez! A resposta correta é " + anos + ".");
            System.out.println("Você errou por apenas " + diferenca + " anos!");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}