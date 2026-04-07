package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Questão 7.B: "Leia três números e determine o maior."
public class QB7 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número ao usuário e armazena a resposta dele na variável 'num1'.
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        // Pede um número ao usuário e armazena a resposta dele na variável 'num2'.
        System.out.print("Digite um segundo número: ");
        int num2 = entrada.nextInt();

        // Pede um número ao usuário e armazena a resposta dele na variável 'num3'.
        System.out.print("Digite um terceiro número: ");
        int num3 = entrada.nextInt();

        // Verifica os nùmeros armazenados em 'num1', 'num2' e 'num3' e determina o maior deles.
        System.out.println("O maior número é o " + ((num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3)) + ".");

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}