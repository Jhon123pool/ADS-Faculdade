package iap.lab3vogalconsoante;

// Importa o Scanner, ferramenta que lê o imput do usuário.
import java.util.Scanner;

public class Lab3VogalConsoante {
    public static void main(String[] args) {

        // Cria uma nova 'classe' pro Scanner e a declara 'entrada' proveniente do System.in.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma letra para saber se é uma vogal ou consoante: ");

        // Abrimos uma variável char chamada 'letra' que coleta o dado inserido pelo usuário.
        char letra = entrada.next().charAt(0);

        // Definimos uma condicional if/else para verificar se a letra que o usuário inseriu é uma vogal (maiúscula ou minúscula), retornando em caso positivo uma mensagem afirmando que aquela letra é uma vogal e em caso negativo uma mensagem afirmando que aquela letra é uma consoante.
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("A letra " + letra + " é uma uma vogal.");
        } else {
            System.out.println("A letra " + letra + " é uma consoante.");
        }
        // Fecha o Scanner, o que evita um vazamento de memória.
        entrada.close();
    }
}
