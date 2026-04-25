package iap.listaexerc2p2;

// Importa o Random, que gera nümeros aleatórios.
import java.util.Random;

/** 
 * Questão 1: Faça um programa que leia 100 números e informe o maior número informado. 
 * Use uma estrutura for.
 */
public class Q1 {
    public static void main(String[] args) {

        // Cria um objeto Random chamado 'rand'
        Random rand = new Random();

        // Cria duas variáveis int chamadas 'num' e 'maior'.
        int num = 0, maior = 0;

        // Pede um número inteiro e guarda a resposta em 'num'.
        System.out.print("Digite um número inteiro: ");
        num = rand.nextInt(200);
        maior = num;
        System.out.print(num);
        System.out.println("\n");

        for (int i = 0; i <=100; i++) {
            if (num >= maior) {
                System.out.println("O maior número inteiro digitado, foi: " + maior);
                System.out.print("Digite outro número inteiro: ");
                num = rand.nextInt(200);
                maior = maior + num;
                System.out.print(num);
                System.out.println("\n");
            } else {
                System.out.print("Digite outro número inteiro: ");
                num = rand.nextInt(200);
                System.out.print(num);
                System.out.println("\n");
            }
            System.out.println("Foram lidos " + i + " números.");  
        }
    }
}
