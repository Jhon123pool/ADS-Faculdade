package iap.listaexerc1p2;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 3 - "Verifique se uma letra digitada é F ou M. Conforme a letra, escrever:
 * (a) F - Feminino,
 * (b) M - Masculino,
 * (c) Gênero não informado."
 */
public class Q3 {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede para o usuário digitar um gênero usando F / M e armazena a resposta dele na variável 'gen'.
        System.out.println("Digite um gênero: (F = Feminino / M = Masculino)");
        char gen = entrada.next().charAt(0);

        /** 
         * Verifica se a letra armazenada em 'gen' corresponde a uma das duass opções
         * e exibe uma mensagem confirmando o gênero selecionado caso positivo, caso
         * negativo, exibe uma mensagem de erro 'Gênero não informado'.
         */
        if (gen == 'F' || gen == 'f') {
            System.out.println("F - Feminino");
        } else if (gen == 'M' || gen == 'm') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Gênero não informado");
        }

        // Fecha o Scanner, que para de ler o input do usuário.
        entrada.close();
    }
}