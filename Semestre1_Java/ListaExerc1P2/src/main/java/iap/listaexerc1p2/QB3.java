package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário
import java.util.Scanner;

// Importa o Locale, que reconhece o . (ponto) como separador decimal.
import java.util.Locale;

/**
 * Questão 3.B: Leia a nota de um aluno e mostre: 
 * • "Aprovado" se nota ≥ 7; 
 * • "Reprovado" se nota < 7. 
 */
public class QB3 {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada' e seta o Locale pro padrão americano.
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Pede uma nota ao usuário e armazena a resposta dele na variável 'nota'.
        System.out.print("Digite a sua nota: ");
        double nota = entrada.nextDouble();

        // Verifica se a nota armazenada na variável 'nota' é maior que 7 ou não e exibe o resultado. 
        System.out.println("Você está: " + ((nota >= 7) ? "Aprovado." : "Reprovado."));

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close(); 
    }
}