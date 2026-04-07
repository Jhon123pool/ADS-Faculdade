package lab6.imparpar;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Lab6ImparPar {
    public static void main(String[] args) {

        // Cria um objeto Scanner, chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Inicia o contador para os números ímpares (uma variável de contagem).
        int contadorI = 0;

        // Inicia o acumulador (uma variável de soma).
        int acumulador = 0;

        // Inicia o contador para os números pares.
        int contadorP = 0;

        // Pede um número ao usuário e armazena a resposta dele na variável 'num'.
        System.out.print("Digite um número inteiro positivo: ");
        int num = entrada.nextInt();

        // Inicia o método while, que só continua rodando enquanto o usuário inserir números iguais ou maiores que zero.
        while (num >= 0) {
            if (num % 2 == 0) {
                acumulador = acumulador + num;
                contadorP = contadorP + 1;
            } else {
                contadorI = contadorI + 1;
            }
            System.out.print("Digite outro número inteiro positivo: ");
            num = entrada.nextInt();
        }

        // Imprime a quantidade de números ímpares que está armazenada na variável 'contadorI'.
        System.out.println("Quantidade de números ímpares: " + contadorI);

        /** 
         * Imprime a quantidade de números pares que está armazenada na variável 'contadorP'. 
         * (Achei legal incluir também, mas o contador dos pares já se fazia necessário para responder
         * a questão 2.C).
         */
        System.out.println("Quantidade de números pares: " + contadorP);

        // Imprime a soma dos números pares que está armazenada na variàvel 'acumulador'.
        System.out.println("Soma dos números pares: " + acumulador);

        // Verifica qual deve ser a mensagem final de acordo com a quantidade de números ímpares e pares.
        if (contadorI > contadorP) {
            System.out.println("Há mais números ímpares do que números pares.");
        } else if (contadorI == contadorP) {
            System.out.println("A quantidade de números ímpares e pares é igual.");
        } else {
            System.out.println("Há mais números pares do que números ímpares.");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}