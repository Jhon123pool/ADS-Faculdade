package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Locale, que reconhece o '.' (ponto) como separador de casas decimais.
import java.util.Locale;

/** 
 * Questão 4.B: Se o valor da compra for maior que 100, aplique 10% de desconto.
 * Use operador ternário para calcular o valor final.
 */ 
public class QB4 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada' e seta o Locale para o padrão americano.
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Pede o valor da compra ao usuário e armazena a resposta dele na variável 'valor'.
        System.out.print("(Use o ponto '.' para separar as casas decimais) \n Digite o valor da sua compra: ");
        double valor = entrada.nextDouble();

        // Verifica se o valor armazenado na variável 'valor' atende ao valor necessário para ter direito ao desconto.
        System.out.println(((valor >= 100) ? "Sua compra tem desconto de 10%, então você só paga " + valor*0.9 + "R$" : "Sua compra não tem desconto, logo você vai pagar " + valor + "R$"));

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}