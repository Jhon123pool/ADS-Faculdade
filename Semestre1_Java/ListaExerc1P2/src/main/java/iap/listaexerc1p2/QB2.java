package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 2.B: Receba a idade de uma pessoa e mostre: 
 * • "Maior de idade" se idade ≥ 18; 
 * • "Menor de idade" caso contrário.
 */ 
public class QB2 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede a idade do usuário e armazena a resposta dele na variável 'idade'.
        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        // Verifica se o número armazenado na variável 'idade' atende à condição de se maior de idade ou não.
        System.out.println("Você é: " + ((idade >= 18) ? "Maior de idade." : "Menor de idade."));

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}