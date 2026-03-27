package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

// Importa o Locale, que permite realizar a separação das casas decimais.
import java.util.Locale;

public class Q15 {
    public static void main(String[] args) {

        /** 
         * Cria um novo objeto Scanner chamado 'entrada' e configura o Locale pro padrão americano
         * que reconhece o ponto (.) como símbolo de separação das casas decimais. 
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Pede uma nota ao usuário e guarda a resposta dele na variável 'nota1'. 
        System. out.print("Digite uma nota usando o ponto (.) como separador decimal (Ex. 7.4): ");
        double nota1 = entrada.nextDouble();

        // Pede uma segunda nota ao usuário e guarda a resposta dele na variável 'nota2'. 
        System. out.print("Digite uma segunda nota usando o ponto (.) como separador decimal (Ex. 8.2): ");
        double nota2 = entrada.nextDouble();

        // Pede uma terceira nota ao usuário e guarda a resposta dele na variável 'nota3'. 
        System. out.print("Digite uma terceira nota usando o ponto (.) como separador decimal Ex. 9.5): ");
        double nota3 = entrada.nextDouble();

        /** 
         * Soma os números guardados nas variáveis 'nota1', 'nota2' e 'nota3',
         *  em seguida divide o resultado por 3 e  armazena o resultado da divisão na variável 'media'.
         */
        double media = (nota1 + nota2 + nota3) / 3;

        boolean aprovado = media >= 7;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("Você está aprovado? " + aprovado + " <-- (true = sim / false = não) ");

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}