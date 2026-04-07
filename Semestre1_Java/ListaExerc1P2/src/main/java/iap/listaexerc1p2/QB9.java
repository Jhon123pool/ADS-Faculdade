package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 9.B: Leia uma temperatura e mostre: 
 * • "Frio" se < 20 
 * • "Agradável" se entre 20 e 30 (inclusive) 
 * • "Quente" se > 30 
 */ 
public class QB9 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede uma temperatura ao usuário e armazena a resposta dele na variável 'temp'.
        System.out.print("Digite a temperatura ambiente atual em Célsius: ");
        int temp = entrada.nextInt();

        // Verifica se o número armazenado na variável 'temp' atende às condições de classificação de temperatura.
        System.out.println(temp + " graus Célsius é " + ((temp < 20) ? "frio." : (temp <= 30) ? "agradável." : "quente."));

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}