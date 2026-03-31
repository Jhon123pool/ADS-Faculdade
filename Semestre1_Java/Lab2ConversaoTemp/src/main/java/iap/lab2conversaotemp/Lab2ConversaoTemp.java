package iap.lab2conversaotemp;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Locale, que reconhece números com casas decimais.
import java.util.Locale;

public class Lab2ConversaoTemp {
    public static void main(String[] args) {

        /** 
         * Cria um objeto Scanner chamado 'entrada' e configura o Locale
         * para o padrão americano que reconhece o ponto '.' como separador
         * das casas decimais.
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um valor de temperatura em Fahrenheit que você queira converter para Celsius: ");

        /** 
         * Define uma variável para armazenar o valor digitado pelo usuário chamada 'fahrenheit' e 
         * no comando seguinte executa o cálculo de conversão para Celsius e guarda o resultado na 
         * variável 'celsius'. 
         * */
        double fahrenheit = entrada.nextDouble (); 
        double celsius = (5.0/9.0) * (fahrenheit - 32);

        // Exibe o resultado do cálculo que definimos na variável "celsius".
        System.out.printf("Temperatura em Celsius: %.2f", celsius);

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}
