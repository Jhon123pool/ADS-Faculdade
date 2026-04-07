package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 9: "Pergunte em que turno você estuda. Peça para digitar M (matutino), 
 * ou V (Vespertino) ou N (Noturno). Imprima a mensagem 'Bom Dia!', 'Boa Tarde!' 
 * ou 'Boa Noite!', ou 'Valor Inválido!', conforme o caso."
 */
public class Q9 {
    public static void main(String [] args) {

        // cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede o turno ao usuário e guarda a resposta dele na variável 'turno'.
        System.out.print("Em que turno você estuda? (M-matutino, V-vespertino, N-noturno): ");
        // Lê a letra digitada pelo usuário e a converte para maiúscula, em seguida armazena essa letra em 'turno'.
        String turno = entrada.next().toUpperCase();

        /**
         * Verifica o caractere armazenado na variável 'turno' e imprime a 
         * saudação correspondente ou uma mensagem de erro para entradas inválidas.
         */
        if (turno.equals("M")) {
            System.out.println("Bom Dia!");
        } else if (turno.equals("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equals("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

        // fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}