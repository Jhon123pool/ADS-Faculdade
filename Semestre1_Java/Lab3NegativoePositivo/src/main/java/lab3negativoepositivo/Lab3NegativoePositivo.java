package lab3negativoepositivo;

// Importa o Scanner, que lê o imput do usuário.
import java.util.Scanner;

public class Lab3NegativoePositivo {
    public static void main(String[] args) {

        // Inicializa o leitor de dados do console.
        Scanner entrada = new Scanner(System.in);

        // Pede um valor inteiro positivo ao usuário e guarda o valor inserido pelo usuário na variável 'valor'.
        System.out.println("Digite um valor inteiro positivo: ");
        int valor = entrada.nextInt();

        // Somente valores menores que zero são considerados erro.
        if (valor < 0) {
            System.out.println("ERRO! VOCÊ DIGITOU UM VALOR NEGATIVO.");
        }
        // Fecha o Scanner, isso evita um vazamento de memória. (Aprendi que isso é uma boa prática)
        entrada.close();
    }
}
