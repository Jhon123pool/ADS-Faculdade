package iap.listaexerc2p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 2: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de multiplicar 
 * de qualquer número inteiro de 1 a 10. O usuário deve informar de qual número ele deseja
 * ver a tabuada. O programa então deve imprimir a tabuada, mas omitindo as linhas e que o
 * multiplicador for múltiplo de 3. A saída deve ser conforme o exemplo abaixo. Use uma
 * estrutura dowhile e continue. Capriche na formatação da tabuada :)
 * Digite um número inteiro de 1 a 10: 5 
 * Tabuada de 5 
 * 5 x 1 = 5 
 * 5 x 2 = 10 
 * 5 x 4 = 20 
 * 5 x 5 = 25 
 * 5 x 7 = 35 
 * 5 x 8 = 40 
 * 5 x 10 = 50        
 */
public class Q2 {
    public static void main(String[] args) {

        // Cria um objeto scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        int num = 0, i = 1;

        /**
         * Dá as boas vindas ao usuário e pede que ele digite o número da tabuada que ele
         * deseja ver, este número é armazenado em 'num'.
         */
        System.out.print("Seja bem-vindo à Tabuada!\nPara começar, digite um número inteiro de 1 a 10: ");
        num = entrada.nextInt();

        System.out.println("Tabuada de " + num + ":");

        do {
            /**
             * Se o número do contador 'i' for múltiplo de 3 (ter resto igual a 0 numa
             * divisão por 3) o contador é aumentado e o código avança para o próximo
             * número.
             */
            if (i % 3 == 0) {
                i++;
                continue;
            }

            /** 
             * Imprime a multiplicação do número armazenado em 'num' pelo número do
             * contador (o que representa uma linha da tabuada) e em seguida incrementa 
             * o contador em 1.
             */
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;

        // A estrutura acima é executada em loop enquanto 'i' for menor ou igual a 10.    
        } while (i<= 10);

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}