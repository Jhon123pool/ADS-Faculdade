package iap.lab7numint;

// Importa o Scanner que lê o input do usuário.
import java.util.Scanner;

public class Lab7NumInt {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        // Entra na estrutura de repetição for e executa o bloco enquanto o contador 'i' for igual ou menor que 20.
        for (int i=1; i<=20; i++) {

            // Pede um número inteiro ao usuário e armazena a resposta dele na variável 'num'.
            System.out.print("Digite um número inteiro: ");
            int num = entrada.nextInt();

            // Soma o número armazenado em 'soma' com o número que o usuário digitar.
            soma = soma + num;

            if (soma >= 100) {
                break;
            }
        }

        // Imprime o resultado final da soma quando o valor foi igual ou superior a 100.
        System.out.println("O valor final da soma foi " + soma);

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}
