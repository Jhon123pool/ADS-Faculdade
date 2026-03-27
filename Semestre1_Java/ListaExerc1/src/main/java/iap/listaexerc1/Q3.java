package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Locale, que permite realizar a separação das casas decimais.
import java.util.Locale;

public class Q3 {
    public static void main(String[] args) {

        /** 
         * Cria um novo objeto Scanner chamado 'entrada' e configura o Locale pro padrão americano
         * que reconhece o ponto (.) como símbolo de separação das casas decimais. 
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Pede a base de um retângulo ao usuário e guarda a resposta dele na variável 'base'. 
        System. out.print("Digite a base do retângulo usando o ponto para separar as casas decimais. (Ex. 7.0): ");
        double base = entrada.nextDouble();

        // Pede a altura de um retângulo e guarda a resposta dele na variável 'altura'.
        System.out.print ("Digite a altura do retângulo usando o ponto para separar as casas decimais. (Ex. 9.0): ");
        double altura = entrada.nextDouble();

        /** 
         * Multiplica os números guardados nas variáveis 'base' e 'altura' e  armazena o resultado 
         * da multiplicação na variável 'area'.
         */
        double area = base * altura;

        // Exibe a o resultado da multiplicação da área do retângulo que está armazenada na variável 'area'.
        System.out.printf("A área do retângulo é " + area + ".");

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}