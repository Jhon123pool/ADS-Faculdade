package iap.listaexerc1p2;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * "Peça um valor e mostre na tela se o valor é positivo ou negativo. 
 *  Lembre-se que 0 é neutro em relação ao sinal."
 */
public class Q2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pede um número ao usuário e armazena este número na variável 'num'.
        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        /** 
         * Verifica se o número armazenado na variável 'num' é um número positivo, negativo ou
         * neutro e exibe uma mensagem de confirmação para cada umaa destas alternativas e em
         * caso de erro, exibe uma mensagem informando que o caractere digitado não é um número
         * inteiro.
         */
        if (num > 0) {
            System.out.println("O número " + num + " é positivo.");
        } else if (num < 0) {
            System.out.println("O número " + num + " é negativo.");
        } else if (num == 0) {
            System.out.println("O número " + num + " (Zero) é neutro.");
        } else {
            System.out.println(num + " não é um número inteiro.");
        }

        // Fecha o Scanner, que para de ler o input do usuário.
        entrada.close();
    }
}