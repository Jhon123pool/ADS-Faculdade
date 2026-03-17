package iap.lab2conversaotemp;
import java.util.Scanner;
import java.util.Locale; /* Primeiro importamos as ferramentas Scanner (que lê os
                          * dados inseridos pelo teclado) e Locale (que reconhece
                          * números com casas decimais). */

public class Lab2ConversaoTemp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        /* Com o comando acima, definimos que o "." será utilizado para separar as
         * casas decimais (seguindo o padrão americano). */
        System.out.println("Digite um valor de temperatura em Fahrenheit que você queira converter para Celsius: ");
        double fahrenheit = entrada.nextDouble (); 
        double celsius = (5.0/9.0) * (fahrenheit - 32);
        /* Com os dois últimos comandos, definimos uma variável para armazenar o
         * valor digitado pelo usuário chamada de fahrenheit e no comando seguinte
         * executamos o cálculo de conversão para Celsius e guardamos o resultado. */
        System.out.printf("Temperatura em Celsius: %.2f", celsius);
        /* Como último comando, o programa exibe o resultado do cálculo que definimos
         * na variável "celsius". */
    }
}
