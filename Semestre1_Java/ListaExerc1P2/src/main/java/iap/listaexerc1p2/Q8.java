package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Questão 8: "Leia três números e mostre-os em ordem decrescente."
public class Q8 {
    public static void main(String [] args) {

        // cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede o primeiro número ao usuário e guarda a resposta na variável 'n1'.
        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();

        // Pede o segundo número ao usuário e guarda a resposta na variável 'n2'.
        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        // Pede o terceiro número ao usuário e guarda a resposta na variável 'n3'.
        System.out.print("Digite o terceiro número: ");
        int n3 = entrada.nextInt();

        /**
         * Verifica a ordem de grandeza entre os números armazenados nas variáveis 'n1', 'n2' e 'n3'
         * e imprime os valores em ordem decrescente.
         */
        System.out.print("Ordem decrescente: ");
        
        if (n1 >= n2 && n1 >= n3) {
            if (n2 >= n3) {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            }
        } else if (n2 >= n1 && n2 >= n3) {
            if (n1 >= n3) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            }
        } else {
            if (n1 >= n2) {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.println(n3 + ", " + n2 + ", " + n1);
            }
        }

        // fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}