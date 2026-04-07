package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Questão 1.B: Peça um número inteiro ao usuário e mostre se ele é par ou ímpar.
public class QB1 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número ao usuário e armazena a resposta dele na variável 'num'.
        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        // Verifica se o número armazenado na variável 'num' é ímpar ou par e imprime o resultado.
        System.out.println("O número " + num + " é" + ((num % 2 == 0) ? " par." : " ímpar."));

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}