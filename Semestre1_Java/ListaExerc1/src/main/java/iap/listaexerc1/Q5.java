package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número inteiro ao usuário e guarda a resposta dele na variável 'num1'. 
        System. out.print("Digite um número inteiro que você queira dividir: ");
        int num1 = entrada.nextInt();

        // Pede outro número inteiro ao usuário e guarda a resposta dele na variável 'num2'. 
        System. out.print("Digite outro número inteiro que você queira dividir: ");
        int num2 = entrada.nextInt();

        /** 
         * Divide o número inteiro guardado na variável 'num1' pelo número inteiro guardado na variável 'num2'
         * e  armazena o resto da divisão na variável 'resto'.
         */
        int resto = num1 % num2;

        //Exibe a o resto da divisão que está armazenado na variável 'resto'.
        System.out.printf("O resto da divisão é " + resto + ".");

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}