package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número ao usuário e guarda a resposta dele na variável 'a'. 
        System. out.print("Digite um número inteiro que você queira verificar: ");
        int a = entrada.nextInt();

        // Pede outro número ao usuário e guarda a resposta dele na variável 'b'. 
        System. out.print("Digite outro número inteiro que você queira verificar: ");
        int b = entrada.nextInt();

        /**
         * Compara e exibe os números guardados em 'a' e 'b' seguindo as condições dos operadores relacionais,
         * onde temos como respostas lógicas o 'true' (verdadeiro) ou 'false' (falso). 
         */
        System.out.println(a + " é igual a " + b + "? " + (a==b));
        System.out.println(a + " é diferente de " + b + "? " + (a!=b));
        System.out.println(a + " é maior que " + b + "? " + (a>b));
        System.out.println(a + " é menor que " + b + "? " + (a<b));
        System.out.println(a + " é maior ou igual a " + b + "? " + (a>=b));
        System.out.println(a + " é menor ou igual a " + b + "? " + (a<=b));

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}