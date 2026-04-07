package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 7: "Pergunte o preço de três produtos e informe qual produto você deve comprar, 
 * sabendo que a decisão é sempre pelo mais barato. "
 */
public class Q7 {
    public static void main(String [] args) {

        // cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede o preço do primeiro produto ao usuário e guarda a resposta dele na variável 'p1'.
        System.out.print("Digite o preço do primeiro produto: ");
        int p1 = entrada.nextInt();

        // Pede o preço do segundo produto ao usuário e guarda a resposta dele na variável 'p2'.
        System.out.print("Digite o preço do segundo produto: ");
        int p2 = entrada.nextInt();

        // Pede o preço do terceiro produto ao usuário e guarda a resposta dele na variável 'p3'.
        System.out.print("Digite o preço do terceiro produto: ");
        int p3 = entrada.nextInt();

        /** 
         * Verifica qual é o valor mais barato número armazenado nas variáveis 'p1', 'p2' e 'p3'
         * e imprime o resultado desta comparação.
         */
        if ((p1 <= p2) && (p1 <= p3)) {
            System.out.println("O produto de valor " + p1 + " é o mais barato.");
        } else if ((p2 <= p1) && (p2 <= p3)) {
            System.out.println("O produto de valor " + p2 + " é o mais barato.");
        } else if ((p3 <= p1) && (p3 <= p2)) {
            System.out.println("O produto de valor " + p3 + " é o mais barato.");
        } else {
            System.out.println("Os valores são iguais.");
        }

        // fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}