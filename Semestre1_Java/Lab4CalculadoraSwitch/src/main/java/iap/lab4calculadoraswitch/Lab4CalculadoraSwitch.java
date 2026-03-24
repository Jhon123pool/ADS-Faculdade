package iap.lab4calculadoraswitch;
// Importa o Scanner, que lê a entrada (input) do usuário.
import java.util.Scanner;

public class Lab4CalculadoraSwitch {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner com o nome 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número ao usuário e em seguida armazena este número na variável 'n1'.
        System.out.print("Digite um número: ");
        int n1 = entrada.nextInt();

        // Pede outro número ao usuário e em seguida armazena o número na variável 'n2'.
        System.out.print("Digite outro número: ");
        int n2 = entrada.nextInt();

        // Mostra as opções de operação ao usuário e guarda a opção escolhida na variável char 'operacao'.
        System.out.print("Escolha a operação que você deseja efetuar: + (Soma), - (Subtração), * (Multiplicação) ou / (Divisão) ");
        char operacao = entrada.next().charAt(0);

        /**
         * Verifica se a resposta do usuário (armazenada em 'operacao') se encaixa em uma das quatro
         * operações possíveis e exibe um resultado (correspondente à operação escolhida) caso a 
         * resposta se encaixe em alguma delas (true), caso negativo (false) exibe uma mensagem de erro
         * apontando que o usuário não digitou uma operação válida.
         */
        switch (operacao) {
            case '+':
                System.out.println("O resultado da soma é: " + (n1 + n2));
                break;
            case '-':
                System.out.println("O resultado da subtração é: " + (n1 - n2));
                break;
            case '*':
                System.out.println("O resultado da multiplicação é: " + (n1 * n2));
                break;
            case '/':
                System.out.println("O resultado da divisão é: " + (n1 / n2));
                break;
            default :
                System.out.println("Erro! " + operacao + " não é uma operação válida.");              
        }
        // Fecha o Scanner e para de coletar dados de entrada (input) do usuário.
        entrada.close();
    }
}
