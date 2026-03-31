package iap.lab5maiusminus;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Lab5MaiusMinus {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede uma letra ao usuário e armazena o primeiro caractere da resposta dele na variável 'letra'.
        System.out.print("Digite uma letra que você queira verificar: ");
        char letra = entrada.next().charAt(0);

        /** 
         * Verifica se o caractere armazenado na variável 'letra' é uma letra maiúscula ou minúscula
         * por meio da tabela ASCII e exibe sua versão oposta, caso não seja uma letra, exibe uma mensagem de erro.
         */
        if (letra >= 65 && letra <= 90) {
            System.out.println("Você digitou uma letra maiúscula. A correspondente minúscula é: " + Character.toLowerCase(letra) + ".");
        } else if (letra >= 97 && letra <= 122) {
            System.out.println("Você digitou uma letra minúscula. A correspondente maiúscula é: " + Character.toUpperCase(letra));
        } else {
            System.out.println("ERRO! O caractere digitado não é uma letra.");
        }

        // Fecha o Scanner e para de ler o input do usuário.
        entrada.close();
    }
}
