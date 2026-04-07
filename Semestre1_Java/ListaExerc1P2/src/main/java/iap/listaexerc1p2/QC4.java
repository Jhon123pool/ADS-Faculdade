package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 4.C: Escreva um programa que calcule o preço de um produto a partir do tempo levado na sua produção 
 * somado ao tempo levado no projeto, com no mínimo um mês cada. Use a seguinte relação para calcular o preço:  
 * • 2 meses: R$ 1.000,00 
 * • 3 meses: R$ 1.500,00 
 * • 4 meses: R$ 2.000,00 
 * • mais de 4 meses: R$ 2.500,00
 */ 
public class QC4 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede o tempo de produção do produto e guarda a resposta dele na variável 'tProd'.
        System.out.print("Digite o número que representa a quantidade de meses gastos na produção (mínimo de 1): ");
        int tProd = entrada.nextInt();

        // Pede o tempo do projeto e guarda a resposta dele na variável 'tProj'.
        System.out.print("Digite o número que representa a quantidade de meses gastos no projeto (mínimmo de 1): ");
        int tProj = entrada.nextInt();

        // Soma os números armazenados nas variáveis 'tprod' e 'tproj' e guarda o resultado na variável 'soma'.
        int tpTotal = tProd + tProj;


        /** 
         * Verifica se o número armazenado na variável 'tpTotal' corresponde a uma das 4 opções disponíveis
         * e retorna uma mensagem mostrando o preço do produto.
         */
        switch (tpTotal) {
            case 2:
                System.out.println("R$1.000,00");
                break;
            case 3:
                System.out.println("R$1.500,00");
                break;
            case 4:
                System.out.println("2.000,00");
                break;
            default :
                System.out.println("2.500,00"); 
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}