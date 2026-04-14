package iap.lab7intervalo;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Lab7Intervalo {
    public static void main(String[] args) {

        // Cria o objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número inteiro ao usuário e guarda a resposta dele na variável 'm'.
        System.out.print("Digite um número inteiro: ");
        int m = entrada.nextInt();

        // Pede um segundo número inteiro ao usuário e guarda a resposta dele na variável 'n'.
        System.out.print("Digite outro número inteiro: ");
        int n = entrada.nextInt();

        // Inverte os valores armazenados em 'm' e 'n' caso 'm' seja maior que 'n'.
        if (m > n) {
            int aux = m;
            m = n;
            n = aux;
        }

        // Exibe o intervalo entre os números armazenados em 'm' e 'n'.
        for (int i = m; i <= n; i++) {
            System.out.println(i + " ");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}
