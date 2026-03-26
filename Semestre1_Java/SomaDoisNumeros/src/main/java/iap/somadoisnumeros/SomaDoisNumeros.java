package iap.somadoisnumeros;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número inteiro ao usuário e guarda a resposta dele na variável 'a'. 
        System. out.print("Digite o primeiro número inteiro: ");
        int a = entrada.nextInt();

        // Pede um segundo número inteiro ao usuário e guarda a resposta dele na variável 'b'.
        System.out.print ("Digite o segundo número inteiro: ");
        int b = entrada.nextInt();

        // Soma os números guardados nas variáveis 'a' e 'b', em seguida armazena o resultado na variável 'soma'. 
        int soma = a + b;

        // Exibe a o resultado da soma que está armazenada na variável 'soma'.
        System.out.printf("A soma de " + a + " + " + b + " é " + soma + ". ");

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}
