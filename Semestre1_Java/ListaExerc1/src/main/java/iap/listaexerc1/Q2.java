package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Locale, que permite realizar a separação das casas decimais.
import java.util.Locale;

public class Q2 {
    public static void main(String[] args) {

        /** 
         * Cria um novo objeto Scanner chamado 'entrada' e configura o Locale pro padrão americano
         * que reconhece o ponto (.) como símbolo de separação das casas decimais. 
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Pede uma nota ao usuário e guarda a resposta dele na variável 'notaa'. 
        System. out.print("Digite a primeira nota usando o ponto para separar as casas decimais. (Ex. 7.9): ");
        double notaa = entrada.nextDouble();

        // Pede uma segunda nota ao usuário e guarda a resposta dele na variável 'notab'.
        System.out.print ("Digite a segunda nota usando o ponto para separar as casas decimais. (Ex. 6.7): ");
        double notab = entrada.nextDouble();

        // Pede uma terceira nota ao usuário e guarda a resposta dele na variável 'notac'.
        System.out.print ("Digite a terceira nota usando o ponto para separar as casas decimais (Ex. 8.5): ");
        double notac = entrada.nextDouble();

        /** 
         * Soma os números guardados nas variáveis 'notaa', 'notab' e 'notac',
         *  em seguida divide o resultado por 3 e  armazena o resultado da divisão na variável 'media'.
         */
        double media = (notaa + notab + notac) / 3;

        // Exibe a o resultado da média do usuário que está armazenada na variável 'media'.
        System.out.printf("A sua média é " + media + ".");

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}