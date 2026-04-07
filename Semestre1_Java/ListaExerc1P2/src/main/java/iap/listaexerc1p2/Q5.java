package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Questão 5: "Leia três números e mostre o maior valor informado."
public class Q5 {
    public static void main(String [] args) {

        // cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número ao usuário e guarda a resposta dele na variável 'num1'.
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        // Pede um segundo número ao usuário e guarda a resposta dele na variável 'num2'.
        System.out.print("Digite um segundo número: ");
        int num2 = entrada.nextInt();

        // Pede um terceiro número ao usuáro e guarda a resposta dele na variável 'num3'.
        System.out.print("Digite um terceiro número: ");
        int num3 = entrada.nextInt();

        /** Verifica qual é o maior número armazenado nas variáveis 'num1', 'num2' e 'num3'
         * e imprime o resultado desta comparação.
         */
        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("O número " + num1 + " é o maior.");
        } else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.println("O número " + num2 + " é o maior.");
        } else if ((num3 >= num1) && (num3 >= num2)) {
            System.out.println("O número " + num3 + " é o maior.");
        } else {
            System.out.println("Os números são iguais.");
        }

        // fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}