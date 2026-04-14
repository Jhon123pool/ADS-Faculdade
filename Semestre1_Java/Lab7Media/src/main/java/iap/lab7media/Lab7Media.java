package iap.lab7media;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Locale, que permite configurar o separador das casas decimais.
import java.util.Locale;

public class Lab7Media {
    public static void main(String[] args) {

        /** 
         * Cria um objeto Scanner chamado 'entrada' e configura o Locale pro padrão americano 
         * que usa o ponto (.) como separador das casas decimais.
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Cria uma variável double chamada 'soma'.
        double soma = 0;

        // Cria uma variável contador com valor zerado.
        int contador = 0;

        // Pede as notas ao usuário e guarda a resposta dele na variável 'nota'.
        System.out.println("Digite as notas usando o ponto (.) como separador das casas decimais (use um número negativo para encerrar): ");
        double nota = entrada.nextDouble();

        /** 
         * Caso o valor armazenado em 'nota' seja maior ou igual a 0 soma o valor e aumenta o contador em 1
         * em seguida libera o Scanner para coletar outra nota.
        */
        while (nota >= 0) {
            soma = soma + nota;
            contador = contador + 1;
            nota = entrada.nextDouble();
        }

        /** 
         * Caso o contador seja maior que 0, o que indica que pelo menos uma nota válida foi informada,
         * exibe a quantidade de notas informadas e a média dessas notas, mas caso o contador não seja maior
         * que zero (0) isso indica que nenhuma nota válida foi inserida e uma mensagem de erro será exibida. 
         */
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Foram informadas " + contador + " notas.");
            System.out.printf("a média das notas é %.2f", media);
        } else {
            System.out.println("Nenhuma nota válida foi informada");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}