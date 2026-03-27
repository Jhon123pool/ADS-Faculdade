package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Locale, que permite realizar a separação das casas decimais.
import java.util.Locale;

public class Q9 {
    public static void main(String[] args) {

        /** 
         * Cria um novo objeto Scanner chamado 'entrada' e configura o Locale pro padrão americano
         * que reconhece o ponto (.) como símbolo de separação das casas decimais. 
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Pede uma nota ao usuário e guarda a resposta dele na variável 'nota1'. 
        System. out.print("Digite uma nota usando o ponto (.) como separador decimal: ");
        double nota1 = entrada.nextDouble();

        // Pede uma segunda nota ao usuário e guarda a resposta dele na variável 'nota2'. 
        System. out.print("Digite uma segunda nota usando o ponto (.) como separador decimal: ");
        double nota2 = entrada.nextDouble();

        /** 
         * Verifica se os números inseridos e armazenados nas variáveis 'nota1' e 'nota2' atendem 
         * à condição booleana de serem iguais e armazena o resultado lógico na variável 'notasIguais'.
         * */ 
        boolean notasIguais = nota1 == nota2;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("A nota " + nota1 + " é igual à nota " + nota2 + "? " + notasIguais);

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}