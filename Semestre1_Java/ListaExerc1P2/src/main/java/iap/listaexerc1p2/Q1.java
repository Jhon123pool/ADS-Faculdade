package iap.listaexerc1p2;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

// Questão 1: "Peça dois números e imprima o maior número."
public class Q1 {
    public static void main(String[] args) {
        
        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um numero ao usuário e armazena a resposta dele na variável 'num1'.
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        // Pede um segundo numero ao usuário e armazena a resposta dele na variável 'num2'.
        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior.");
        } else {
            System.out.println(num2 + " é maior.");
        }

        // Fecha o Scanner, que para de ler o input do usuário.
        entrada.close();
    }
}
