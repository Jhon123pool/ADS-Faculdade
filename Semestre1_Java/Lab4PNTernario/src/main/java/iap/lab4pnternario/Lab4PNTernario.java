package iap.lab4pnternario;
// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Lab4PNTernario {
    public static void main(String[] args) {
        
        // Cria um novo objeto scanner com o nome 'entrada'.
        Scanner entrada = new Scanner(System.in);

        /** 
         * Exibe uma mensagem ao usuário pedindo um número inteiro para ser verificado;
         * Em seguida armazena o número digitado na variável 'numero'.
         */
        System.out.print("Digite um número inteiro que você queira verificar: ");
        int numero = entrada.nextInt();

        /**
         * Verifica se o número coletado atende ás confições e guarda um valor lógico dentro da variável
         * resultado, uma mensagem (determinada pelo valor lógico guardado na variável 'resultado') será
         * retornada ao usuário classificando o número digitado entre positivo
         * (se verdadeiro) ou negativo (se falso).
         */
        String resultado = (numero >= 0) ? "O número " + numero + " é positivo." : "O número " + numero + " é negativo.";
        System.out.println(resultado);

        // Fecha o Scanner e deixa de coletar dados de entrada (input) do usuário.
        entrada.close();
    }
}
