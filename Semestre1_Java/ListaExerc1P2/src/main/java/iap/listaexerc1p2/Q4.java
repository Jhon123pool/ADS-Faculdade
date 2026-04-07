package iap.listaexerc1p2;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

// Questão 4: "Verifique se uma letra digitada è vogal ou consoante usando  a tebela ASCII."
public class Q4 {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado entrada.
        Scanner entrada = new Scanner(System.in);

        // Pede uma letra ao usuário e armazena a resposta dele na variável 'letra'.
        System.out.print("Digite uma letra: ");
        char letra = entrada.next().charAt(0);

        // Verifica se a letra armazenada na variável 'letra' é vogal ou consoante usando a tabela ASCII.
        if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else if ((letra >= 65 && letra <= 90) || (letra >= 97 && letra <= 122)) {
            System.out.println("A letra " + letra + " é uma consoante.");
        } else {
            System.out.println("O caractere " + letra + " não é uma letra!");
        }

        // fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}
